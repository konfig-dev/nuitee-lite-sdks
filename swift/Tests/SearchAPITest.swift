//
//  BookAPITest.swift
//
//

@testable import Nuitee

import Foundation
import XCTest

class SearchAPITest: XCTestCase {
    let dateFormatter = DateFormatter()
    override func setUpWithError() throws {
        let apiKey = ProcessInfo.processInfo.environment["NUITEE_API_KEY"]!
        NuiteeAPI.customHeaders = [
            "X-API-Key": apiKey,
        ]
        dateFormatter.dateFormat = "yyyy-MM-dd"
    }

    override func tearDownWithError() throws {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
    }

    func testGetHotels() throws {
        let expectation = XCTestExpectation(description: "Response is not null")
        let hotelIds = "1000018,26191,248093,57871,268206,28906,497829,436827,1000091,1000876,1001301,1001325,1001464,99249,99122,99121,99119"
        SearchAPI.getHotels(hotelIds: hotelIds, checkin: "2025-01-01", checkout: "2025-01-25", country: "US", adults: 1, currency: "USD", guestNationality: "US") { response, error in
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

    func testGetHotelRates() throws {
        let expectation = XCTestExpectation(description: "Response is not null")
        let hotelIds = "57871,26191,248093,268206,28906,497829,436827"
        SearchAPI.getHotelRates(hotelIds: hotelIds, checkin: "2025-01-01", checkout: "2025-01-25", adults: 1, guestNationality: "US", currency: "USD") { response, error in
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
