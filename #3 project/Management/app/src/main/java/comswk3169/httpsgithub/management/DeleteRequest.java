package comswk3169.httpsgithub.management;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by swk31 on 2018-03-05.
 */

public class DeleteRequest extends StringRequest {

    final static private String URL = "http://10.0.2.2/Delete.php";
    private Map<String, String> parameters;

    public DeleteRequest(String userID, Response.Listener<String> listener) {
        super(Request.Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
    }

    @Override
    public Map <String, String> getParams() {
        return parameters;
    }
}
