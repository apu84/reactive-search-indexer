package reactive.searchindexer;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ApplicationInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String, String> appInfo = new HashMap<>();
        appInfo.put("name", "Search Indexer");
        appInfo.put("description", "Search Indexer app for chatty");
        builder.withDetail("app", appInfo);
    }
}
