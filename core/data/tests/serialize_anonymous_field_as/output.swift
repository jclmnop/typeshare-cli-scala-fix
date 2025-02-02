/*
 Generated by typeshare 1.1.0
 */

import Foundation

public enum SomeEnum: Codable {
	/// The associated String contains some opaque context
	case context(String)
	case other(Int32)

	enum CodingKeys: String, CodingKey, Codable {
		case context = "Context",
			other = "Other"
	}

	private enum ContainerCodingKeys: String, CodingKey {
		case type, content
	}

	public init(from decoder: Decoder) throws {
		let container = try decoder.container(keyedBy: ContainerCodingKeys.self)
		if let type = try? container.decode(CodingKeys.self, forKey: .type) {
			switch type {
			case .context:
				if let content = try? container.decode(String.self, forKey: .content) {
					self = .context(content)
					return
				}
			case .other:
				if let content = try? container.decode(Int32.self, forKey: .content) {
					self = .other(content)
					return
				}
			}
		}
		throw DecodingError.typeMismatch(SomeEnum.self, DecodingError.Context(codingPath: decoder.codingPath, debugDescription: "Wrong type for SomeEnum"))
	}

	public func encode(to encoder: Encoder) throws {
		var container = encoder.container(keyedBy: ContainerCodingKeys.self)
		switch self {
		case .context(let content):
			try container.encode(CodingKeys.context, forKey: .type)
			try container.encode(content, forKey: .content)
		case .other(let content):
			try container.encode(CodingKeys.other, forKey: .type)
			try container.encode(content, forKey: .content)
		}
	}
}
