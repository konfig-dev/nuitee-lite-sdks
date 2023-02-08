//
// BookResponseDataCancellation.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct BookResponseDataCancellation: Codable, JSONEncodable, Hashable {

    public var fee: BookResponseDataCancellationFee?

    public init(fee: BookResponseDataCancellationFee? = nil) {
        self.fee = fee
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case fee
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(fee, forKey: .fee)
    }
}
