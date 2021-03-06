package pigeon.header;

import com.yhy.http.pigeon.annotation.Header;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2020-10-26 21:02
 * version: 1.0.0
 * desc   :
 */
public class TimestampHeader implements Header.Dynamic {
    @Override
    public String name() {
        return "Timestamp";
    }

    @Override
    public String value() {
        return new Date().getTime() + "";
    }

    @Override
    public Map<String, String> pairs(Method method) {
        return null;
    }
}
