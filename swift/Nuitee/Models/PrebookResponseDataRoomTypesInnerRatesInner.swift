//
// PrebookResponseDataRoomTypesInnerRatesInner.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct PrebookResponseDataRoomTypesInnerRatesInner: Codable, JSONEncodable, Hashable {

    public var rateId: String?
    public var name: String?
    public var maxOccupancy: Int?
    public var retailRate: PrebookResponseDataRoomTypesInnerRatesInnerRetailRate?
    public var cancellationPolicies: PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies?

    public init(rateId: String? = nil, name: String? = nil, maxOccupancy: Int? = nil, retailRate: PrebookResponseDataRoomTypesInnerRatesInnerRetailRate? = nil, cancellationPolicies: PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies? = nil) {
        self.rateId = rateId
        self.name = name
        self.maxOccupancy = maxOccupancy
        self.retailRate = retailRate
        self.cancellationPolicies = cancellationPolicies
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case rateId
        case name
        case maxOccupancy
        case retailRate
        case cancellationPolicies
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(rateId, forKey: .rateId)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(maxOccupancy, forKey: .maxOccupancy)
        try container.encodeIfPresent(retailRate, forKey: .retailRate)
        try container.encodeIfPresent(cancellationPolicies, forKey: .cancellationPolicies)
    }
}
