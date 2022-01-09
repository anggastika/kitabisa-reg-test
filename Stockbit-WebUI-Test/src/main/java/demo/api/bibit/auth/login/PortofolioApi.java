package demo.api.bibit.auth.login;

import static demo.constants.EndpointConstants.ENDPOINT_GET_PORTOFOLIO_BY_CATEGORY_ID;
import static demo.constants.EndpointConstants.ENDPOINT_GET_PORTOFOLIO_SUMMARY;

import io.restassured.response.Response;

public class PortofolioApi extends BaseApi {

  public static void main(String[] args) {
    PortofolioApi api = new PortofolioApi();
    Response response = api.getPortofolio();
  }

  public Response getPortofolio() {
    Response response = baseRequestWithLogin()
        .get(ENDPOINT_GET_PORTOFOLIO_SUMMARY);
    response.getBody().prettyPrint();
    return response;
  }

  public Response getPortofolioByCategoryId(String categoryId){
    Response response = baseRequestWithLogin().pathParam("categoryId", categoryId)
        .get(ENDPOINT_GET_PORTOFOLIO_BY_CATEGORY_ID);
    response.getBody().prettyPrint();
    return response;
  }

}
