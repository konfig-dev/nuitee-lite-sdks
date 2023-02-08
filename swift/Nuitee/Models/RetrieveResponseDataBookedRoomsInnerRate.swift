//
// RetrieveResponseDataBookedRoomsInnerRate.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct RetrieveResponseDataBookedRoomsInnerRate: Codable, JSONEncodable, Hashable {

    public var maxOccupancy: Int?
    public var retailRate: BookResponseDataBookedRoomsInnerRateRetailRate?

    public init(maxOccupancy: Int? = nil, retailRate: BookResponseDataBookedRoomsInnerRateRetailRate? = nil) {
        self.maxOccupancy = maxOccupancy
        self.retailRate = retailRate
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case maxOccupancy
        case retailRate
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(maxOccupancy, forKey: .maxOccupancy)
        try container.encodeIfPresent(retailRate, forKey: .retailRate)
    }
}
