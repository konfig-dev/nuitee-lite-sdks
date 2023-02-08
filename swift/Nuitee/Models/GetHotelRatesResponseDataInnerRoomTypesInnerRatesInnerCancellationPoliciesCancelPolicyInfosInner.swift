//
// GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner: Codable, JSONEncodable, Hashable {

    public var cancelTime: String?
    public var amount: Double?
    public var type: String?
    public var currency: String?

    public init(cancelTime: String? = nil, amount: Double? = nil, type: String? = nil, currency: String? = nil) {
        self.cancelTime = cancelTime
        self.amount = amount
        self.type = type
        self.currency = currency
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case cancelTime
        case amount
        case type
        case currency
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(cancelTime, forKey: .cancelTime)
        try container.encodeIfPresent(amount, forKey: .amount)
        try container.encodeIfPresent(type, forKey: .type)
        try container.encodeIfPresent(currency, forKey: .currency)
    }
}
