//
// BookResponseDataGuestInfo.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct BookResponseDataGuestInfo: Codable, JSONEncodable, Hashable {

    public var guestFirstName: String?
    public var guestLastName: String?
    public var guestEmail: String?

    public init(guestFirstName: String? = nil, guestLastName: String? = nil, guestEmail: String? = nil) {
        self.guestFirstName = guestFirstName
        self.guestLastName = guestLastName
        self.guestEmail = guestEmail
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case guestFirstName
        case guestLastName
        case guestEmail
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(guestFirstName, forKey: .guestFirstName)
        try container.encodeIfPresent(guestLastName, forKey: .guestLastName)
        try container.encodeIfPresent(guestEmail, forKey: .guestEmail)
    }
}

