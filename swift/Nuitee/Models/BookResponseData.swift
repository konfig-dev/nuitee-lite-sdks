//
// BookResponseData.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct BookResponseData: Codable, JSONEncodable, Hashable {

    public var bookingId: String?
    public var status: String?
    public var hotelConfirmationCode: String?
    public var checkin: String?
    public var checkout: String?
    public var hotel: BookResponseDataHotel?
    public var bookedRooms: [BookResponseDataBookedRoomsInner]?
    public var guestInfo: BookResponseDataGuestInfo?
    public var createdAt: String?
    public var cancellation: BookResponseDataCancellation?
    public var cancellationPolicies: BookResponseDataCancellationPolicies?
    public var price: Double?

    public init(bookingId: String? = nil, status: String? = nil, hotelConfirmationCode: String? = nil, checkin: String? = nil, checkout: String? = nil, hotel: BookResponseDataHotel? = nil, bookedRooms: [BookResponseDataBookedRoomsInner]? = nil, guestInfo: BookResponseDataGuestInfo? = nil, createdAt: String? = nil, cancellation: BookResponseDataCancellation? = nil, cancellationPolicies: BookResponseDataCancellationPolicies? = nil, price: Double? = nil) {
        self.bookingId = bookingId
        self.status = status
        self.hotelConfirmationCode = hotelConfirmationCode
        self.checkin = checkin
        self.checkout = checkout
        self.hotel = hotel
        self.bookedRooms = bookedRooms
        self.guestInfo = guestInfo
        self.createdAt = createdAt
        self.cancellation = cancellation
        self.cancellationPolicies = cancellationPolicies
        self.price = price
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case bookingId
        case status
        case hotelConfirmationCode
        case checkin
        case checkout
        case hotel
        case bookedRooms
        case guestInfo
        case createdAt
        case cancellation
        case cancellationPolicies
        case price
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(bookingId, forKey: .bookingId)
        try container.encodeIfPresent(status, forKey: .status)
        try container.encodeIfPresent(hotelConfirmationCode, forKey: .hotelConfirmationCode)
        try container.encodeIfPresent(checkin, forKey: .checkin)
        try container.encodeIfPresent(checkout, forKey: .checkout)
        try container.encodeIfPresent(hotel, forKey: .hotel)
        try container.encodeIfPresent(bookedRooms, forKey: .bookedRooms)
        try container.encodeIfPresent(guestInfo, forKey: .guestInfo)
        try container.encodeIfPresent(createdAt, forKey: .createdAt)
        try container.encodeIfPresent(cancellation, forKey: .cancellation)
        try container.encodeIfPresent(cancellationPolicies, forKey: .cancellationPolicies)
        try container.encodeIfPresent(price, forKey: .price)
    }
}

