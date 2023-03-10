//
// ListHotelsResponseDataInner.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ListHotelsResponseDataInner: Codable, JSONEncodable, Hashable {

    public var id: Int?
    public var name: String?
    public var hotelDescription: String?
    public var hotelImportantInformation: String?
    public var currency: String?
    public var country: String?
    public var city: String?
    public var latitude: Double?
    public var longitude: Double?
    public var address: String?
    public var zip: String?

    public init(id: Int? = nil, name: String? = nil, hotelDescription: String? = nil, hotelImportantInformation: String? = nil, currency: String? = nil, country: String? = nil, city: String? = nil, latitude: Double? = nil, longitude: Double? = nil, address: String? = nil, zip: String? = nil) {
        self.id = id
        self.name = name
        self.hotelDescription = hotelDescription
        self.hotelImportantInformation = hotelImportantInformation
        self.currency = currency
        self.country = country
        self.city = city
        self.latitude = latitude
        self.longitude = longitude
        self.address = address
        self.zip = zip
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case name
        case hotelDescription
        case hotelImportantInformation
        case currency
        case country
        case city
        case latitude
        case longitude
        case address
        case zip
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(hotelDescription, forKey: .hotelDescription)
        try container.encodeIfPresent(hotelImportantInformation, forKey: .hotelImportantInformation)
        try container.encodeIfPresent(currency, forKey: .currency)
        try container.encodeIfPresent(country, forKey: .country)
        try container.encodeIfPresent(city, forKey: .city)
        try container.encodeIfPresent(latitude, forKey: .latitude)
        try container.encodeIfPresent(longitude, forKey: .longitude)
        try container.encodeIfPresent(address, forKey: .address)
        try container.encodeIfPresent(zip, forKey: .zip)
    }
}

