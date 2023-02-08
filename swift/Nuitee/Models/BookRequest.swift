//
// BookRequest.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct BookRequest: Codable, JSONEncodable, Hashable {

    /** prebook id retrived from prebook response */
    public var prebookId: String
    /** session id retrieved from rates response */
    public var sessionId: String?
    public var guestInfo: BookRequestGuestInfo?
    /** rate id retrieved from prebook response */
    public var rateId: String

    public init(prebookId: String, sessionId: String? = nil, guestInfo: BookRequestGuestInfo? = nil, rateId: String) {
        self.prebookId = prebookId
        self.sessionId = sessionId
        self.guestInfo = guestInfo
        self.rateId = rateId
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case prebookId
        case sessionId
        case guestInfo
        case rateId
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(prebookId, forKey: .prebookId)
        try container.encodeIfPresent(sessionId, forKey: .sessionId)
        try container.encodeIfPresent(guestInfo, forKey: .guestInfo)
        try container.encode(rateId, forKey: .rateId)
    }
}

