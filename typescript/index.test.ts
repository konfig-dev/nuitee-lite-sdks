import {
  BookingManagementApi,
  Configuration,
  SearchApi,
  StaticDataApi,
} from ".";
describe("API Tests", () => {
  const apiKey = process.env.NUITEE_API_KEY;
  const config = new Configuration({ apiKey });
  it("StaticData", async () => {
    const api = new StaticDataApi(config);

    const response = await api.listCountries();
    expect(response).not.toBeNull();
  });
  it("Booking management", async () => {
    const api = new BookingManagementApi(config);
    const response = await api.retrieve("3uFbXs3Vz");
    expect(response).not.toBeNull();
    expect(response.data.data?.bookingId).not.toBeNull();
  });
  it("Search", async () => {
    const api = new SearchApi(config);
    const hotelIds =
      "1000018,2691,248093,57871,268206,28906,497829,436827,1000091,1000876,1001301,1001325,1001464,99249,99122,99121,99119";
    const response = await api.getHotels(
      hotelIds,
      "2025-01-01",
      "2025-01-05",
      "US",
      1,
      "USD",
      "US"
    );
    expect(response).not.toBeNull();
  });
});
