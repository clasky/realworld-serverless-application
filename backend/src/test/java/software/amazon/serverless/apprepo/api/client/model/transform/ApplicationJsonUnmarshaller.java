/**
 *
 */
package software.amazon.serverless.apprepo.api.client.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import software.amazon.serverless.apprepo.api.client.model.Application;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.core.JsonToken;

import javax.annotation.Generated;

/**
 * Application JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationJsonUnmarshaller implements Unmarshaller<Application, JsonUnmarshallerContext> {

  public Application unmarshall(JsonUnmarshallerContext context) throws Exception {
    Application application = new Application();

    int originalDepth = context.getCurrentDepth();
    String currentParentElement = context.getCurrentParentElement();
    int targetDepth = originalDepth + 1;

    JsonToken token = context.getCurrentToken();
    if (token == null)
      token = context.nextToken();
    if (token == VALUE_NULL) {
      return null;
    }

    while (true) {
      if (token == null)
        break;

      if (token == FIELD_NAME || token == START_OBJECT) {
        if (context.testExpression("applicationId", targetDepth)) {
          context.nextToken();
          application.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
        }
        if (context.testExpression("author", targetDepth)) {
          context.nextToken();
          application.setAuthor(context.getUnmarshaller(String.class).unmarshall(context));
        }
        if (context.testExpression("creationTime", targetDepth)) {
          context.nextToken();
          application.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
        }
        if (context.testExpression("description", targetDepth)) {
          context.nextToken();
          application.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
        }
        if (context.testExpression("homePageUrl", targetDepth)) {
          context.nextToken();
          application.setHomePageUrl(context.getUnmarshaller(String.class).unmarshall(context));
        }
      } else if (token == END_ARRAY || token == END_OBJECT) {
        if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
          if (context.getCurrentDepth() <= originalDepth)
            break;
        }
      }
      token = context.nextToken();
    }

    return application;
  }

  private static ApplicationJsonUnmarshaller instance;

  public static ApplicationJsonUnmarshaller getInstance() {
    if (instance == null)
      instance = new ApplicationJsonUnmarshaller();
    return instance;
  }
}
