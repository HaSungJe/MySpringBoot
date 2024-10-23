package msb.dashboard;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/dashboard")
public class DashBoardController {


    
    @GetMapping("/data1")
    public Map<String, Object> data1() {
        Map<String, Object> response = new HashMap<>();
        response.put("statusCode", 200);
        response.put("message", "성공");
        return response;
    }

    @GetMapping("/data2/{data}")
    public Map<String, Object> data2(@PathVariable("data") String data) {
        Map<String, Object> response = new HashMap<>();
        response.put("statusCode", 200);
        response.put("message", "성공");
        response.put("data", data);
        return response;
    }

    @GetMapping("/data3")
    public Map<String, Object> getMethodName(@RequestParam() Map<String, Object> data) {
        Map<String, Object> response = new HashMap<>();
        response.put("statusCode", 200);
        response.put("message", "성공");
        
        Set<String> keys = data.keySet();
        for (String key : keys) {
            response.put(key, data.get(key));
        }

        return response;
    }
    
}
