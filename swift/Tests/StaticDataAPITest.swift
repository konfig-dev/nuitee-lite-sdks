//
//  BookAPITest.swift
//
//

@testable import Nuitee

import XCTest

class StaticDataAPITest: XCTestCase {
    override func setUpWithError() throws {
        let apiKey = ProcessInfo.processInfo.environment["NUITEE_API_KEY"]!
        NuiteeAPI.customHeaders = [
            "X-API-Key": apiKey,
        ]
    }

    override func tearDownWithError() throws {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
    }

    func testListCountries() throws {
        let listCountriesExpectation = XCTestExpectation(description: "Response is not null")
        StaticDataAPI.listCountries { response, error in
            guard error == nil else {
                print(error!)
                return
            }

            if response != nil {
                listCountriesExpectation.fulfill()
            }
        }
        wait(for: [listCountriesExpectation], timeout: 10.0)
    }

    func testListHotels() throws {
        let listHotelsExpectation = XCTestExpectation(description: "Response is not null")
        StaticDataAPI.listHotels(countryCode: "US", cityName: "Las Vegas", limit: 1000, offset: 0, latitude: 36.12510, longitude: -115.16988, distance: 1000) { response, error in
            guard error == nil else {
                print(error!)
                return
            }

            if response != nil {
                listHotelsExpectation.fulfill()
            }
        }
        wait(for: [listHotelsExpectation], timeout: 20.0)
    }

    func testListCurrencies() throws {
        let expectation = XCTestExpectation(description: "Response is not null")
        StaticDataAPI.listCurrencies { response, error in
            guard error == nil else {
                print(error!)
                return
            }

            if response != nil {
                expectation.fulfill()
            }
        }
        wait(for: [expectation], timeout: 10.0)
    }

    func testListCities() throws {
        let expectation = XCTestExpectation(description: "Response is not null")
        StaticDataAPI.listCities(countryCode: "AE") { response, error in
            guard error == nil else {
                print(error!)
                return
            }

            if response != nil {
                expectation.fulfill()
            }
        }
        wait(for: [expectation], timeout: 10.0)
    }

    func testListIataCodes() throws {
        let expectation = XCTestExpectation(description: "Response is not null")
        StaticDataAPI.listIataCodes { response, error in
            guard error == nil else {
                print(error!)
                return
            }

            if response != nil {
                expectation.fulfill()
            }
        }
        wait(for: [expectation], timeout: 10.0)
    }
}
