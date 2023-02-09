//
//  BookAPITest.swift
//
//

@testable import Nuitee

import XCTest

class BookAPITest: XCTestCase {
    let rateId = "2_GQZTMOBSG56DEMBSGMWTAMZNGE2XYMRQGIZS2MBTFUYTM7BRPQYTELBZPRKVG7CHGRNFIT2OIJLUORJTI5FU4USVI5MVSVCPJVJFOR2RLJCECTS2KNDVUVCEJVNFEV2NKFNEOR2NKJIUOTK2IRCU2QSXI5ITGR2NJZNFMR2ZLJCE2WK2K5DVKWSEIFHFEU2HLEZFITKOIJMEOTRWIRBUSWSTI5AVURCHJVBFIR2FGJMFSTKSKFDUSWSUIFGVUUSHLI3EOSZTKM3UWVSKLBMVMS2UKBJEWVSHKJCDIR2GIFKEKUK2KJDUSV2UKM3UEU2HJE2EIRZXINLEOSSMIZITIVBUI5CTGRCPJZFFUR2NGNKECTSKK5DVCWSUJFMVIWSOKZKVGR2OKJJUQRJSKNDU2WSSIZKTGRCFJ5FFMUCSJJCU2VCUGRDUSWKEIVGVUUKHJVMVIRKNJJNEOQKZJBMU2MZUI5EVSVCBJZBFURKOIJCUKSJSKNEVUSCDI5GVEUKHJFNFGMSNIJKEMVKZKRCXYVKTIR6HI4TBOZSWYZLSGF6HYMRSGEXDAML4GIYDEMZNGAZS2MJSPRBEE"
    override func setUpWithError() throws {
        let apiKey = ProcessInfo.processInfo.environment["NUITEE_API_KEY"]!
        NuiteeAPI.customHeaders = [
            "X-API-Key": apiKey,
        ]
    }

    override func tearDownWithError() throws {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
    }

    func testPrebook() throws {
        let expectation = XCTestExpectation(description: "Response is not null")
        let prebookRequest = PrebookRequest(rateId: rateId)
        BookAPI.prebook(prebookRequest: prebookRequest) { response, error in
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

    func testBook() throws {
        let expectation = XCTestExpectation(description: "Response is not null")
        let guestInfo = BookRequestGuestInfo(guestFirstName: "John", guestLastName: "Doe", guestEmail: "john.doe@gmail.com")
        let bookRequest = BookRequest(prebookId: "dYMiMhpP4", guestInfo: guestInfo, rateId: rateId)
        BookAPI.book(bookRequest: bookRequest) { response, error in
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
