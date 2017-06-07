package club.veev.cloud.nutz.bean;

import org.nutz.dao.entity.annotation.Column;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Veev on 2017/5/27
 */
public class BaseBean implements Serializable {

    @Column("createdAt")
    private Date createdAt;
    @Column("updatedAt")
    private Date updatedAt;
}
