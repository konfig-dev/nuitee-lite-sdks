//
// Retrieve400ResponseError.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct Retrieve400ResponseError: Codable, JSONEncodable, Hashable {

    public var code: Double?
    public var message: String?

    public init(code: Double? = nil, message: String? = nil) {
        self.code = code
        self.message = message
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case code
        case message
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(code, forKey: .code)
        try container.encodeIfPresent(message, forKey: .message)
    }
}

