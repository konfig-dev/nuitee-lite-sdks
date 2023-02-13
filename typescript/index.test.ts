import { Configuration, StaticDataApi } from ".";
describe("API Tests", () => {
  it("StaticData", async () => {
    const apiKey = process.env.NUITEE_API_KEY;
    const config = new Configuration({ apiKey });

    const api = new StaticDataApi(config);

    const request = await api.listCountries();
    expect(request).not.toBeNull();
  });
});
