package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:browserstack.properties"
})

public interface BrowserstackConfig extends Config {

    String username();

    String password();

    @Key("bs")
    @DefaultValue("bs://acf4e9f1dc760e262cdd3f0efb5418947b478066")
    String bs();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String device();

    @Key("osVersion")
    @DefaultValue("9.0")
    String osVersion();

}