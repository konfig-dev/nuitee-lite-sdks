//
//  BookAPITest.swift
//
//

@testable import Nuitee

import XCTest

class APITest: XCTestCase {
    override func setUpWithError() throws {
        let apiKey = ProcessInfo.processInfo.environment["NUITEE_API_KEY"]!
        NuiteeAPI.customHeaders = [
            "X-API-Key": apiKey,
        ]
    }

    override func tearDownWithError() throws {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
    }

    func testAPI() throws {
        let listCountriesExpectation = XCTestExpectation(description: "Response is not null")
        var listCountriesResponse: ListCountriesResponse?
        StaticDataAPI.listCountries { response, error in
            guard error == nil else {
                print(error!)
                return
            }

            if response != nil {
                listCountriesExpectation.fulfill()
                listCountriesResponse = response
            }
        }

        wait(for: [listCountriesExpectation], timeout: 30.0)
        print("Executed listCountries")
        let countryCode: String = listCountriesResponse!.data![1].code!
        dump(countryCode)

        let listHotelsExpectation = XCTestExpectation(description: "Response is not null")
        var listHotelsResponse: ListHotelsResponse?
        StaticDataAPI.listHotels(countryCode: countryCode) { response, error in
            guard error == nil else {
                print(error!)
                return
            }

            if response != nil {
                listHotelsExpectation.fulfill()
                listHotelsResponse = response
            }
        }
        wait(for: [listHotelsExpectation], timeout: 60.0)
        dump(listHotelsResponse)

        // let expectation = XCTestExpectation(description: "Response is not null")
        // SearchAPI.getHotelRates(hotelIds: String, checkin: String, checkout: String, adults: Int, guestNationality: String, currency: String, children: String?, sessionId: String?, travelerId: String?, apiResponseQueue: DispatchQueue, completion: ((GetHotelRatesResponse?, Error?) -> Void))() { response, error in
        //     guard error == nil else {
        //         print(error!)
        //         return
        //     }

        //     if response != nil {
        //         expectation.fulfill()
        //         dump(response)
        //     }
        // }
        // wait(for: [expectation], timeout: 120.0)
    }
}
