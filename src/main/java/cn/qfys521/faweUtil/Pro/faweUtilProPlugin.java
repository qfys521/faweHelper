package cn.qfys521.faweUtil.Pro;

import cn.chuanwise.xiaoming.interactor.Interactors;
import cn.chuanwise.xiaoming.plugin.JavaPlugin;
import cn.chuanwise.xiaoming.plugin.Plugin;

import cn.qfys521.faweUtil.Pro.iterator.faweUtilProInteractors;



/**
 * 插件主类
 * 类的全限定名要和资源文件 xiaoming.json 或 plugin.json 中的 main 完全相同
 *
 * @author Chuanwise
 * @version 1.0-SNAPSHOT
 */
public class faweUtilProPlugin
        extends JavaPlugin {

    /**
     * 插件具备 static final 的名为 INSTANCE 的属性时，小明会首先查看其值是否
     * 实现了 {@link cn.chuanwise.xiaoming.plugin.Plugin} 接口，如果实现
     * 则取出并作为本插件加载。如果不是，或为 null，则小明将调用默认的无参构造方法
     * 构造一个插件主类的对象。
     */
    private static final faweUtilProPlugin INSTANCE = new faweUtilProPlugin();

    /** 获取插件实例 */
    public static faweUtilProPlugin getInstance() {
        return INSTANCE;
    }


    /** 插件启动时的回调方法 */
    @Override
    public void onEnable() {
        getLogger().info("faweUtilPro opening");
        getXiaoMingBot().getInteractorManager().registerInteractors(new faweUtilProInteractors(), this);
    }
}
