//
//  BookAPITest.swift
//
//

@testable import Nuitee

import XCTest

class BookingManagementAPITest: XCTestCase {
    override func setUpWithError() throws {
        let apiKey = ProcessInfo.processInfo.environment["NUITEE_API_KEY"]!
        NuiteeAPI.customHeaders = [
            "X-API-Key": apiKey,
        ]
    }

    override func tearDownWithError() throws {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
    }

    func testRetrieve() throws {
        let expectation = XCTestExpectation(description: "Response is not null")
        BookingManagementAPI.retrieve(bookingId: "3uFbXs3Vz") { response, error in
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

    // func testCancel() throws {
    //     let expectation = XCTestExpectation(description: "Response is not null")
    //     BookingManagementAPI.cancel(bookingId: "UEHyvIeuX") { response, error in
    //         guard error == nil else {
    //             print(error!)
    //             dump(error?.localizedDescription)
    //             return
    //         }

    //         if response != nil {
    //             expectation.fulfill()
    //         }
    //     }
    //     wait(for: [expectation], timeout: 10.0)
    // }

    func testListBookings() throws {
        let expectation = XCTestExpectation(description: "Response is not null")
        BookingManagementAPI.listBookings(guestId: "FrT56hfty") { response, error in
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
