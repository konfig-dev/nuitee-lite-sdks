//
// BookResponseDataBookedRoomsInnerRoomType.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct BookResponseDataBookedRoomsInnerRoomType: Codable, JSONEncodable, Hashable {

    public var roomTypeId: String?
    public var name: String?

    public init(roomTypeId: String? = nil, name: String? = nil) {
        self.roomTypeId = roomTypeId
        self.name = name
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case roomTypeId
        case name
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(roomTypeId, forKey: .roomTypeId)
        try container.encodeIfPresent(name, forKey: .name)
    }
}
