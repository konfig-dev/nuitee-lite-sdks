//
// ListCitiesResponseDataInner.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ListCitiesResponseDataInner: Codable, JSONEncodable, Hashable {

    public var city: String?

    public init(city: String? = nil) {
        self.city = city
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case city
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(city, forKey: .city)
    }
}

