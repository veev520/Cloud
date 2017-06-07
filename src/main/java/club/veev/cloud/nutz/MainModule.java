package club.veev.cloud.nutz;

import org.nutz.mvc.annotation.*;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

/**
 * Created by Veev on 2017/5/25
 */
@Ok("json:full")
@Fail("jsp:jsp.500")
@SetupBy(value=MainSetup.class)
@IocBy(type=ComboIocProvider.class,
        args={"*js", "ioc/",
                "*anno", "club.veev.cloud",
                "*tx"})
@Modules(scanPackage=true)
public class MainModule {
}
