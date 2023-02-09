//
// SearchAPI.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class SearchAPI {

    /**
     Hotel full rate availability
     
     - parameter hotelIds: (query) hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56) 
     - parameter checkin: (query) start date yyyy-mm-dd format 
     - parameter checkout: (query) end date yyyy-mm-dd format 
     - parameter adults: (query) adults number 
     - parameter guestNationality: (query) guest nationality country code iso-2 example (US) 
     - parameter currency: (query) currency code example (USD) 
     - parameter children: (query) children ages separated by a comma (optional)
     - parameter sessionId: (query) session id if retrieved from hotels search (optional)
     - parameter travelerId: (query) traveler unique id (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func getHotelRates(hotelIds: String, checkin: Date, checkout: Date, adults: Int, guestNationality: String, currency: String, children: String? = nil, sessionId: String? = nil, travelerId: String? = nil, apiResponseQueue: DispatchQueue = NuiteeAPI.apiResponseQueue, completion: @escaping ((_ data: GetHotelRatesResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return getHotelRatesWithRequestBuilder(hotelIds: hotelIds, checkin: checkin, checkout: checkout, adults: adults, guestNationality: guestNationality, currency: currency, children: children, sessionId: sessionId, travelerId: travelerId).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Hotel full rate availability
     - GET /hotels/rates
     - This endpoint allows you to send a hotel ID with a specific date range and in response receive all the rooms, rates that are available along with the cancelllation policies.
     - API Key:
       - type: apiKey X-API-Key 
       - name: ApiKeyAuth
     - parameter hotelIds: (query) hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56) 
     - parameter checkin: (query) start date yyyy-mm-dd format 
     - parameter checkout: (query) end date yyyy-mm-dd format 
     - parameter adults: (query) adults number 
     - parameter guestNationality: (query) guest nationality country code iso-2 example (US) 
     - parameter currency: (query) currency code example (USD) 
     - parameter children: (query) children ages separated by a comma (optional)
     - parameter sessionId: (query) session id if retrieved from hotels search (optional)
     - parameter travelerId: (query) traveler unique id (optional)
     - returns: RequestBuilder<GetHotelRatesResponse> 
     */
    open class func getHotelRatesWithRequestBuilder(hotelIds: String, checkin: Date, checkout: Date, adults: Int, guestNationality: String, currency: String, children: String? = nil, sessionId: String? = nil, travelerId: String? = nil) -> RequestBuilder<GetHotelRatesResponse> {
        let localVariablePath = "/hotels/rates"
        let localVariableURLString = NuiteeAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "hotelIds": (wrappedValue: hotelIds.encodeToJSON(), isExplode: true),
            "checkin": (wrappedValue: checkin.encodeToJSON(), isExplode: true),
            "checkout": (wrappedValue: checkout.encodeToJSON(), isExplode: true),
            "adults": (wrappedValue: adults.encodeToJSON(), isExplode: true),
            "children": (wrappedValue: children?.encodeToJSON(), isExplode: true),
            "guestNationality": (wrappedValue: guestNationality.encodeToJSON(), isExplode: true),
            "currency": (wrappedValue: currency.encodeToJSON(), isExplode: true),
            "sessionId": (wrappedValue: sessionId?.encodeToJSON(), isExplode: true),
            "travelerId": (wrappedValue: travelerId?.encodeToJSON(), isExplode: true),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<GetHotelRatesResponse>.Type = NuiteeAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Hotel minimum rate availability
     
     - parameter hotelIds: (query) hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56) 
     - parameter checkin: (query)  
     - parameter checkout: (query)  
     - parameter country: (query)  
     - parameter adults: (query)  
     - parameter currency: (query)  
     - parameter guestNationality: (query)  
     - parameter latitude: (query)  (optional)
     - parameter longitude: (query)  (optional)
     - parameter distance: (query)  (optional)
     - parameter children: (query)  (optional)
     - parameter travelerId: (query)  (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func getHotels(hotelIds: String, checkin: Date, checkout: Date, country: String, adults: Int, currency: String, guestNationality: String, latitude: Double? = nil, longitude: Double? = nil, distance: Int? = nil, children: String? = nil, travelerId: String? = nil, apiResponseQueue: DispatchQueue = NuiteeAPI.apiResponseQueue, completion: @escaping ((_ data: GetHotelsResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return getHotelsWithRequestBuilder(hotelIds: hotelIds, checkin: checkin, checkout: checkout, country: country, adults: adults, currency: currency, guestNationality: guestNationality, latitude: latitude, longitude: longitude, distance: distance, children: children, travelerId: travelerId).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Hotel minimum rate availability
     - GET /hotels
     - This endpoint allows you to send a list of hotel ID's for a specific date range and in response receive the best rate available for each of the hotel ID's. The limit is set to 200 hotels
     - API Key:
       - type: apiKey X-API-Key 
       - name: ApiKeyAuth
     - parameter hotelIds: (query) hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56) 
     - parameter checkin: (query)  
     - parameter checkout: (query)  
     - parameter country: (query)  
     - parameter adults: (query)  
     - parameter currency: (query)  
     - parameter guestNationality: (query)  
     - parameter latitude: (query)  (optional)
     - parameter longitude: (query)  (optional)
     - parameter distance: (query)  (optional)
     - parameter children: (query)  (optional)
     - parameter travelerId: (query)  (optional)
     - returns: RequestBuilder<GetHotelsResponse> 
     */
    open class func getHotelsWithRequestBuilder(hotelIds: String, checkin: Date, checkout: Date, country: String, adults: Int, currency: String, guestNationality: String, latitude: Double? = nil, longitude: Double? = nil, distance: Int? = nil, children: String? = nil, travelerId: String? = nil) -> RequestBuilder<GetHotelsResponse> {
        let localVariablePath = "/hotels"
        let localVariableURLString = NuiteeAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "hotelIds": (wrappedValue: hotelIds.encodeToJSON(), isExplode: true),
            "checkin": (wrappedValue: checkin.encodeToJSON(), isExplode: true),
            "checkout": (wrappedValue: checkout.encodeToJSON(), isExplode: true),
            "country": (wrappedValue: country.encodeToJSON(), isExplode: true),
            "latitude": (wrappedValue: latitude?.encodeToJSON(), isExplode: true),
            "longitude": (wrappedValue: longitude?.encodeToJSON(), isExplode: true),
            "distance": (wrappedValue: distance?.encodeToJSON(), isExplode: true),
            "adults": (wrappedValue: adults.encodeToJSON(), isExplode: true),
            "children": (wrappedValue: children?.encodeToJSON(), isExplode: true),
            "currency": (wrappedValue: currency.encodeToJSON(), isExplode: true),
            "guestNationality": (wrappedValue: guestNationality.encodeToJSON(), isExplode: true),
            "travelerId": (wrappedValue: travelerId?.encodeToJSON(), isExplode: true),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<GetHotelsResponse>.Type = NuiteeAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }
}
