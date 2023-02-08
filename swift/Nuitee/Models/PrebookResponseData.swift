//
// PrebookResponseData.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct PrebookResponseData: Codable, JSONEncodable, Hashable {

    public var prebookId: String?
    public var hotelId: String?
    public var currency: String?
    public var termsAndConditions: String?
    public var roomTypes: [PrebookResponseDataRoomTypesInner]?
    public var price: Double?
    /** the difference percentage if rate price has changed */
    public var priceDifferencePercent: Double?
    /** has cancellation changed */
    public var cancellationChanged: Bool?
    /** has board changed */
    public var boardChanged: Bool?

    public init(prebookId: String? = nil, hotelId: String? = nil, currency: String? = nil, termsAndConditions: String? = nil, roomTypes: [PrebookResponseDataRoomTypesInner]? = nil, price: Double? = nil, priceDifferencePercent: Double? = nil, cancellationChanged: Bool? = nil, boardChanged: Bool? = nil) {
        self.prebookId = prebookId
        self.hotelId = hotelId
        self.currency = currency
        self.termsAndConditions = termsAndConditions
        self.roomTypes = roomTypes
        self.price = price
        self.priceDifferencePercent = priceDifferencePercent
        self.cancellationChanged = cancellationChanged
        self.boardChanged = boardChanged
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case prebookId
        case hotelId
        case currency
        case termsAndConditions
        case roomTypes
        case price
        case priceDifferencePercent
        case cancellationChanged
        case boardChanged
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(prebookId, forKey: .prebookId)
        try container.encodeIfPresent(hotelId, forKey: .hotelId)
        try container.encodeIfPresent(currency, forKey: .currency)
        try container.encodeIfPresent(termsAndConditions, forKey: .termsAndConditions)
        try container.encodeIfPresent(roomTypes, forKey: .roomTypes)
        try container.encodeIfPresent(price, forKey: .price)
        try container.encodeIfPresent(priceDifferencePercent, forKey: .priceDifferencePercent)
        try container.encodeIfPresent(cancellationChanged, forKey: .cancellationChanged)
        try container.encodeIfPresent(boardChanged, forKey: .boardChanged)
    }
}

