package club.veev.cloud.nutz;

import club.veev.cloud.Log;
import org.nutz.dao.Dao;
import org.nutz.dao.util.Daos;
import org.nutz.ioc.Ioc;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;

/**
 * Created by Veev on 2017/5/25
 */
public class MainSetup implements Setup {

    @Override
    public void init(NutConfig nc) {
        Ioc ioc = nc.getIoc();
        Dao dao = ioc.get(Dao.class);
        Daos.createTablesInPackage(dao, "club.veev.cloud.nutz.bean", false);

        Log.i("程序起来啦");
    }

    @Override
    public void destroy(NutConfig nc) {

    }
}
