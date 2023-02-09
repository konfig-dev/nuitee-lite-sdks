//
//  BookAPITest.swift
//
//

@testable import Nuitee

import Foundation
import XCTest

class SearchAPITest: XCTestCase {
    override func setUpWithError() throws {
        let apiKey = ProcessInfo.processInfo.environment["NUITEE_API_KEY"]!
        NuiteeAPI.customHeaders = [
            "X-API-Key": apiKey,
        ]
    }

    override func tearDownWithError() throws {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
    }

    func testGetHotels() throws {
        let expectation = XCTestExpectation(description: "Response is not null")
        let now = Date()
        var dateComponent = DateComponents()
        dateComponent.month = 2
        let checkin = Calendar.current.date(byAdding: dateComponent, to: now)!
        dateComponent.month = 4
        let checkout = Calendar.current.date(byAdding: dateComponent, to: now)!
        SearchAPI.getHotels(checkin: checkin, checkout: checkout, country: "US", adults: 1, currency: "USD", guestNationality: "US") { response, error in
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
