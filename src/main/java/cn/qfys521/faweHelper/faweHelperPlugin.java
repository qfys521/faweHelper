package cn.qfys521.faweHelper;

import cn.chuanwise.xiaoming.plugin.JavaPlugin;
import cn.chuanwise.xiaoming.plugin.Plugin;

import cn.qfys521.faweHelper.iterator.faweHelperInteractors;


public class faweHelperPlugin extends JavaPlugin implements Plugin {


    public static final faweHelperPlugin INSTANCE = new faweHelperPlugin();

    private faweHelperPlugin() {

    }

    /** 插件启动时串行调用 */
    @Override
    public void onEnable() {
        getLogger().info("faweHelper启动中");
        getLogger().warn("//brush、/tool、//masks、/patterms、/schematic、/anvil和/transforms会导致大量刷屏，请谨慎使用");
        getLogger().warn("为了安全起见，本命令提示已要求在获得权限'fawe.warn.question'下才可使用");
        getLogger().warn("且发送时会私信调用.");
        getXiaoMingBot().getInteractorManager().registerInteractors(new faweHelperInteractors(), this);

    }
} 