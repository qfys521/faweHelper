package cn.qfys521.faweHelper.iterator;


import cn.chuanwise.xiaoming.annotation.EventListener;
import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.Permissions;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.qfys521.faweHelper.faweHelperPlugin;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaomingUser;

public class faweHelperInteractors extends SimpleInteractors<faweHelperPlugin> {
    @Required("fawe.question")
    @Filter("/we threads")
    public void thread(XiaomingUser user) {
        user.sendMessage("/we threads" + "\n" + "权限： worldedit.threads" + "\n" + "说明： 显示出目前插件使用的所有线程");
    }

    @Required("fawe.question")
    @Filter("/we version")
    public void ver(XiaomingUser user) {
        user.sendMessage("/we version" + "\n" + "说明： 获取当前 WorldEdit / FAWE 插件的版本信息");
    }

    @Required("fawe.qurstion")
    @Filter("/we help")
    public void help(XiaomingUser user) {
        user.sendMessage("/we help [<command>]" + "\n" + "权限： worldedit.help" + "\n" + "说明： 显示 FAWE 插件的命令帮助信息");
    }

    @Required("debugpaste")
    @Filter("/we debugpaste")
    public void debugpaste(XiaomingUser user) {
        user.sendMessage("/we debugpaste" + "\n" + "权限： worldedit.debugpaste" + "\n" + "说明： 将调试信息上传到 hastebin.com");
    }

    @Required("fawe.question")
    @Filter("/we changelog")
    public void changlog(XiaomingUser user) {
        user.sendMessage("/we changelog" + "\n" + "权限： worldedit.changelog" + "\n" + "说明： 查看 FAWE 插件的更新日志");
    }

    @Required("fawe.question")
    @Filter("/we reload")
    public void reload(XiaomingUser user) {
        user.sendMessage("/we reload" + "\n" + "权限： worldedit.reload" + "\n" + "说明： 重载插件配置");
    }

    @Required("fawe.question")
    @Filter("/we tz")
    public void timezone(XiaomingUser user) {
        user.sendMessage("/we tz [timezone]" + "\n" + "说明： 设定时区，方便为快照命名");
    }

    @Required("fawe.question")
    @Filter("/we cui")
    public void cui(XiaomingUser user) {
        user.sendMessage("/we cui" + "\n" + "说明： 完成 CUI 信息交换（内部开发使用）");
    }

    @Required("fawe.question")
    @Filter("/remove ")
    public void remove(XiaomingUser user) {
        user.sendMessage("/remove <type> <radius>\n" +
                "权限： worldedit.remove\n" +
                "描述： 移除所有指定类型的实体");
    }

    @Required("fawe.question")
    @Filter("//fill")
    public void fill(XiaomingUser user) {
        user.sendMessage("//fill <block> <radius> [depth]\n" +
                "权限： worldedit.fill\n" +
                "描述： 填充一块洞");
    }

    @Required("fawe.question")
    @Filter("//help")
    public void help2(XiaomingUser user) {
        user.sendMessage("//fill <block> <radius> [depth]\n" +
                "权限： worldedit.fill\n" +
                "描述： 填充一块洞");
    }

    @Required("fawe.question")
    @Filter("//drain")
    public void drain(XiaomingUser user) {
        user.sendMessage("//drain <radius>\n" +
                "权限： worldedit.drain\n" +
                "描述： 移除一片池塘内的水\n");
    }

    @Required("fawe.question")
    @Filter("//removenear")
    public void removenear(XiaomingUser user) {
        user.sendMessage("//removenear <block> [size]\n" +
                "权限： worldedit.removenear\n" +
                "描述： 移除你附近的方块");
    }

    @Required("fawe.question")
    @Filter("//fillr")
    public void fillr(XiaomingUser user) {
        user.sendMessage("//fillr <block> <radius> [depth]\n" +
                "权限： worldedit.fill.recursive\n" +
                "描述： 递归填充周围的洞\n");
    }

    @Required("fawe.question")
    @Filter("//removeabove")
    public void removeabove(XiaomingUser user) {
        user.sendMessage("//removeabove [size] [height]\n" +
                "权限： worldedit.removeabove\n" +
                "描述： 移除你头上方的方块");
    }

    @Required("fawe.question")
    @Filter("//fixlava")
    public void fixlava(XiaomingUser user) {
        user.sendMessage("//fixlava <radius>\n" +
                "权限： worldedit.fixlava\n" +
                "描述： 让岩浆静止");
    }

    @Required("fawe.question")
    @Filter("//removebelow")
    public void removeblow(XiaomingUser user) {
        user.sendMessage("//removebelow [size] [height]\n" +
                "权限： worldedit.removebelow\n" +
                "描述： 移除你脚下方的方块\n");
    }

    @Required("fawe.question")
    @Filter("//fixwater")
    public void fixwater(XiaomingUser user) {
        user.sendMessage("//fixwater <radius>\n" +
                "权限： worldedit.fixwater\n" +
                "描述： 让水静止\n");
    }

    @Required("fawe.question")
    @Filter("//green")
    public void green(XiaomingUser user) {
        user.sendMessage("//green [radius] [-f]\n" +
                "权限： worldedit.green\n" +
                "描述： 绿化半径中的区域");
    }

    @Required("fawe.question")
    @Filter("//replacenear")
    public void replacenear(XiaomingUser user) {
        user.sendMessage("//replacenear <size> <from-id> <to-id> [-f]\n" +
                "权限： worldedit.replacenear\n" +
                "描述： 替换附近的方块");
    }

    @Required("fawe.question")
    @Filter("//snow")
    public void snow(XiaomingUser user) {
        user.sendMessage("//snow [radius]\n" +
                "权限： worldedit.snow\n" +
                "描述： 模仿下雪");
    }

    @Required("fawe.question")
    @Filter("/butcher")
    public void butcher(XiaomingUser user) {
        user.sendMessage("/butcher [radius] [-p] [-l] [-a] [-n] [-g] [-b] [-t] [-f] [-r]\n" +
                "权限： worldedit.butcher\n" +
                "描述： 击杀附近的怪物，根据半径，如果没有特别给出半径的话则使用配置文件中的默认半径。\n" +
                "可用的标记：\n" +
                "-p 也击杀宠物\n" +
                "-n 也击杀 NPC\n" +
                "-g 也击杀铁傀儡\n" +
                "-a 也击杀动物。\n" +
                "-b 也击杀中立生物\n" +
                "-t 也击杀带有名字的怪物\n" +
                "-f 相当于这以前所有标记的混合\n" +
                "-r 也击杀盔甲架\n" +
                "-l 目前没有具体作用\n");
    }

    @Required("fawe.question")
    @Filter("//ex")
    public void ex(XiaomingUser user) {
        user.sendMessage("//ex [radius]\n" +
                "权限： worldedit.extinguish\n" +
                "描述： 熄灭周围的火");
    }

    @Required("fawe.question")
    @Filter("//thaw")
    public void thaw(XiaomingUser user) {
        user.sendMessage("//thaw [radius]\n" +
                "权限： worldedit.thaw\n" +
                "描述： 移除周围的区域中的雪与冰");
    }

    @Required("fawe.question")
    @Filter("//calc")
    public void calc(XiaomingUser user) {
        user.sendMessage("//calc <expression>\n" +
                "权限： worldedit.calc\n" +
                "描述： 求一个数学表达式的值\n");
    }

    @Required("fawe.question")
    @Filter("//confirm")
    public void confirm(XiaomingUser user) {
        user.sendMessage("//confirm\n" +
                "描述： 确认一条命令");
    }

    @Required("fawequestion")
    @Filter("//replace")
    public void replace(XiaomingUser user) {
        user.sendMessage("//replace [from-mask] <to-pattern> [-f]\n" +
                "权限： worldedit.region.replace\n" +
                "说明： 用给定的方块替换选区中所有另一给定的方块");
    }

    @Required("fawe.question")
    @Filter("//stack")
    public void stack(XiaomingUser user) {
        user.sendMessage("//stack [count] [direction] [-s] [-a] [-m]\n" +
                "权限： worldedit.region.stack\n" +
                "说明： 堆叠复制选区中的内容\n" +
                "标记：\n" +
                "-s 将选区移动到最后一次被堆叠复制的区域\n" +
                "-a 跳过空气方块\n");
    }

    @Required("fawe.question")
    @Filter("//set")
    public void set(XiaomingUser user) {
        user.sendMessage("//set [pattern]\n" +
                "权限： worldedit.region.set\n" +
                "说明： 将选区填充为给定方块");
    }

    @Required("fawe.question")
    @Filter("//fall")
    public void fall(XiaomingUser user) {
        user.sendMessage("//fall [replace] [-m]\n" +
                "权限： worldedit.region.fall\n" +
                "说明： 让选区中的方块自然掉落\n" +
                "-m 标记仅会让方块在垂直方向上下落");
    }

    @Required("fawe.question")
    @Filter("//faces")
    public void faces(XiaomingUser user) {
        user.sendMessage("//faces <block>\n" +
                "权限： worldedit.region.faces\n" +
                "说明： 建造出选区的墙壁，天花板和地板");
    }

    @Required("fawe.question")
    @Filter("//center")
    public void center(XiaomingUser user) {
        user.sendMessage("//center <block>\n" +
                "权限： worldedit.region.center\n" +
                "说明： 填充出选区的中心方块");
    }

    @Required("fawe.question")
    @Filter("//hollow")
    public void hollow(XiaomingUser user) {
        user.sendMessage("//hollow [<thickness>[ <block>]]\n" +
                "权限： worldedit.region.hollow\n" +
                "说明： 将本区域设置为中空\n" +
                "可以设置“中空”的部分用什么方块来填充\n" +
                "厚度用[曼哈顿距离]来计算。");
    }

    @Required("fawe.question")
    @Filter("//smooth")
    public void smooth(XiaomingUser user) {
        user.sendMessage("//smooth [iterations] [-n]\n" +
                "权限： worldedit.region.smoothsnow\n" +
                "说明： 将区域平滑化\n" +
                "-n 标记仅更改自然生成的方块。\n" +
                "-s 标记只更改雪方块。");
    }

    @Required("fawe.question")
    @Filter("//nbtinfo")
    public void nbtinfo(XiaomingUser user) {
        user.sendMessage("//nbtinfo\n" +
                "权限： worldedit.nbtinfo\n" +
                "说明： 查看一个方块的NBT信息");
    }

    @Required("fawe.question")
    @Filter("//setskylight")
    public void setskylight(XiaomingUser user) {
        user.sendMessage("//setskylight\n" +
                "权限： worldedit.light.set\n" +
                "说明： 设置一个选区的天空亮度");
    }

    @Required("fawe.question")
    @Filter("//line")
    public void line(XiaomingUser user) {
        user.sendMessage("//line <block> [thickness] [-h]\n" +
                "权限： worldedit.region.line\n" +
                "说明： 以长方体选择区域的两个对角绘制出一条对角线线段。\n" +
                "仅能够在长方体选区中使用。\n" +
                "可用的标记：\n" +
                "-h 仅会生成外壳");
    }

    @Required("fawe.warn.question")
    @Filter("//masks")
    public void masks(XiaomingUser user) {
        user.sendError("消息过长，我已经通过私信调用给你了QAQ");
        user.sendPrivateMessage("蒙版 /Masks  \n" +
                "(关于蒙版方面的帮助 更多信息)\n" +
                "蒙版决定了方块能否被放置\n" +
                "- 使用 [brackets] 来输入参数 - 使用 , 来代表 或 的分割\n" +
                "- 使用 & 来代表 与 的分割\n" +
                "例如： >[stone,dirt],#light[0][5],$jungle 更多信息: https://git.io/v9r4K\n" +
                "#offset <dx> <dy> <dz> <mask>\n" +
                "说明： 使蒙版偏移对应坐标值\n" +
                "% <chance>\n" +
                "说明： 百分比几率\n" +
                "#id\n" +
                "说明： 限制初始ID\n" +
                "#data\n" +
                "说明： 限制初始数据值\n" +
                "{ <min> <max>\n" +
                "说明： 限制方块与初始方块的距离范围\n" +
                "#existing\n" +
                "说明： 设置限制为非空气方块\n" +
                "$ <biome>\n" +
                "说明： 限制操作在特殊的生物群系中，要想列出所有的生物群系请使用 //biomelist\n" +
                "#surface\n" +
                "说明： 限制操作在表面方块上（任何接触空气的固体方块）\n" +
                "! <mask>\n" +
                "说明： 取对应蒙版的“非”值\n" +
                "= <expression>\n" +
                "说明： 表达式蒙版\n" +
                "#region\n" +
                "说明： 在某个提供的区域内部\n" +
                "\\ <min> <max>\n" +
                "说明： 限制为特殊的地形坡度\n" +
                "-o 标记仅仅会覆盖，举个例子： /[0d][45d]\n" +
                "作用解释：能够选出任何坡度在0-45度之间的方块\n" +
                "示例：/[3][20]\n" +
                "作用解释：能够选出任何坡度在3-20度之间的方块\n" +
                "#dregion\n" +
                "说明： 在玩家的选取之中\n" +
                "#xaxis\n" +
                "说明： 限制为特殊的x轴坐标位置\n" +
                "#yaxis\n" +
                "说明： 限制为特殊的y轴坐标位置\n" +
                "#opacity <min> <max>\n" +
                "说明： 限制为指定的不透明度等级\n" +
                "#light <min> <max>\n" +
                "说明： 限制为指定的光亮等级\n" +
                "#blocklight <min> <max>\n" +
                "说明： 限制为指定的方块亮度等级\n" +
                "#haslight\n" +
                "说明： 限制为方块是否拥有光照（天空或环境）\n" +
                "~ <mask> [min=1] [max=8]\n" +
                "说明： 邻近的其他方块的数量\n" +
                "#brightness <min> <max>\n" +
                "说明： 限制指定的方块光照等级\n" +
                "#nolight\n" +
                "说明： 限制方块需要没有光亮（天空或环境）\n" +
                "#skylight <min> <max>\n" +
                "说明： 限制需要指定天空光亮等级\n" +
                "#simplex <scale=10> <min=0> <max=100>\n" +
                "说明： 使用噪声算法作为蒙版\n" +
                "#zaxis\n" +
                "说明： 限制为特殊的z轴坐标位置\n" +
                "> <mask>\n" +
                "说明： 限制在某一指定方块的上面\n" +
                "#wall\n" +
                "说明： 限制为墙壁（任意方块，东西南北任意一面为空气）\n" +
                "| <mask> <min> <max>\n" +
                "说明： 限制旁边位置拥有指定数量的其他方块\n" +
                "#iddata\n" +
                "说明： 限制指定的方块ID与数据值\n" +
                "< <mask>\n" +
                "说明： 在某一指定方块之下\n" +
                "#solid\n" +
                "说明： 限制仅操作固体方块\n" +
                "\n");
    }

    @Required("fawe.warn.question")
    @Filter("/patterms")
    public void patterms(XiaomingUser user) {
        user.sendError("消息过长，我已经通过私信调用给你了QAQ");
        user.sendPrivateMessage("样式 /Patterns\n" +
                "(对于某些方块样式信息的帮助。 更多信息)\n" +
                "样式决定放置什么方块\n" +
                "- 使用 [brackets] 输入参数\n" +
                "- 使用 , 来代表 或 的分割\n" +
                "举个例子： #surfacespread[10][#existing],andesite\n" +
                "更多信息: https://git.io/vSPmA\n" +
                "#offset <dx> <dy> <dz> <pattern>\n" +
                "说明： 使样式偏移对应坐标值\n" +
                "#mask <mask> <pattern-true> <pattern-false>\n" +
                "说明： 根据蒙版应用样式\n" +
                "#id <pattern>\n" +
                "说明： 只改变方块ID\n" +
                "#spread <dx> <dy> <dz> <pattern>\n" +
                "说明： 随机扩散方块\n" +
                "#buffer <pattern>\n" +
                "说明： 只有当样式在使用时才放置方块\n" +
                "如果你不想点击某些地方两次时，用它和笔刷搭配\n" +
                "#clipboard\n" +
                "说明： 使用你剪切板中的方块作为样式\n" +
                "#relative <pattern>\n" +
                "说明： 将样式偏移到你所点击的位置\n" +
                "#data <pattern>\n" +
                "说明： 只会改变方块的数据值\n" +
                "#biome <biome>\n" +
                "说明： 设置生物群系\n" +
                "#existing\n" +
                "说明： 仅更改已经存在的方块\n" +
                "= <expression>\n" +
                "说明： 样式表达式： http://wiki.sk89q.com/wiki/WorldEdit/Expression_syntax\n" +
                "#simplex <scale=10> <pattern>\n" +
                "说明： 使用噪声算法来随机放置方块\n" +
                "#averagecolor <color> [randomize=true] [max-complexity=100]\n" +
                "说明： 在已经存在的方块和颜色之间平均化\n" +
                "#desaturate [percent=100] [randomize=true] [max-complexity=100]\n" +
                "说明： 减小已经存在的方块的饱和度\n" +
                "#darken [randomize=true] [max-complexity=100]\n" +
                "说明： 减小已经存在的方块的亮度\n" +
                "#fullcopy [schem|folder|url=#copy] [rotate=false] [flip=false]\n" +
                "说明： 将你完整的剪切板填充到方块上\n" +
                "#buffer2d <pattern>\n" +
                "说明： 只有在一列中的样式被使用时才会放置方块\n" +
                "#lighten [randomize=true] [max-complexity=100]\n" +
                "说明： 增大已存在的方块的亮度\n" +
                "#saturate <color> [randomize=true] [max-complexity=100]\n" +
                "说明： 增加已经存在的方块的饱和度\n" +
                "#anglecolor [randomize=true] [max-complexity=100]\n" +
                "说明： 根据坡度角的大小，计算出的较正常方块暗的方块\n" +
                "#iddatamask <bitmask=15> <pattern>\n" +
                "说明： 使用样式的ID和目的方块的数据值放置方块\n" +
                "- 用于替换半砖或其他方块数据值需要修改的方块\n" +
                "#angledata\n" +
                "说明： 根据坡度角提供方块数据值\n" +
                "#!x <pattern>\n" +
                "说明： 本样式不会提供z轴的信息。\n" +
                "举个例子： #!x[#!z[#~[#l3d[pattern]]]]\n" +
                "#!y <pattern>\n" +
                "说明： 本样式不会提供y轴的信息\n" +
                "#linear <pattern>\n" +
                "说明： 循环从样式列表中读取并设置方块\n" +
                "#!z <pattern>\n" +
                "说明： 本样式不会提供z轴的信息\n" +
                "#surfacespread <distance> <pattern>\n" +
                "说明： 随机改变地面上一个方块的位置\n" +
                "#linear3d <pattern>\n" +
                "说明： 使用 x,y,z 坐标选定一个来自列表中的方块\n" +
                "#solidspread <dx> <dy> <dz> <pattern>\n" +
                "说明： 随机传播固体方块\n" +
                "#color <color>\n" +
                "说明： 使用接近于指定颜色的方块\n" +
                "\n");
    }

    @Required("fawe.warn.question")
    @Filter("/transforms")
    public void transforms(XiaomingUser user) {
        user.sendError("消息过长，我已经通过私信调用给你了QAQ");
        user.sendPrivateMessage("变换式 /Transforms\n" +
                "(变换式的有关帮助。 更多信息)\n" +
                "变换式会在放置方块之前，对其作出某种变化\n" +
                "- 在 [brackets] 中输入参数\n" +
                "- 使用 , 来代表 或 的分割\n" +
                "- 使用 & 来代表 与 的分割\n" +
                "更多信息: https://git.io/v9KHO\n" +
                "#offset <dx> <dy> <dz> [transform]\n" +
                "说明： 偏移变换式，将方块偏移指定坐标后放置\n" +
                "#rotate <rotateX> <rotateY> <rotateZ> [transform]\n" +
                "说明： 所有的变化都会被绕着指定位置旋转\n" +
                "#scale <dx> <dy> <dz> [transform]\n" +
                "说明： 所有的变化都会按比例进行缩放\n" +
                "#pattern <pattern> [transform]\n" +
                "说明： 使用给定的方块样式\n" +
                "#spread <dx> <dy> <dz> [transform]\n" +
                "说明： 随机偏移变换式\n" +
                "#linear <transform>\n" +
                "说明： 从变换式列表中循环选择变换式\n" +
                "#linear3d <transform>\n");
    }

    @Required("fawe.warn.question")
    @Filter("//brush")
    public void bursh(XiaomingUser user) {
        user.sendError("消息过长，我已经通过私信调用给你了QAQ");
        user.sendPrivateMessage("/brush copypaste [depth=5]\n" +
                "权限： worldedit.brush.copy\n" +
                "说明： 左键点击一个物体的底座来复制。\n" +
                "右键点击来粘贴\n" +
                "-r 标记能够在粘贴时应用随机旋转\n" +
                "注意：能和剪切板滚动一起搭配使用\n" +
                "视频： https://www.youtube.com/watch?v=RPZIaTbqoZw\n" +
                "/brush command <radius> [cmd1;cmd2...]\n" +
                "权限： worldedit.brush.command\n" +
                "说明： 在点击的位置执行一条命令。\n" +
                "你的选区会延展到包括该点\n" +
                "可用的变量： {x}, {y}, {z}, {world}, {size}\n" +
                "/brush populateschematic <mask> <file|folder|url> [radius=30] [points=5] [-r]\n" +
                "权限： worldedit.brush.populateschematic\n" +
                "说明： 选择分散型schematic笔刷。\n" +
                "-r 标记能够应用随机旋转\n" +
                "/brush scmd <scatter-radius> <points> <cmd-radius=1> <cmd1;cmd2...>\n" +
                "权限： worldedit.brush.scattercommand\n" +
                "说明： 在表面的随机一点执行命令\n" +
                "分散的半径是每个点之间的最小距离\n" +
                "你的选区会延展到包括该点\n" +
                "可用的变量： {x}, {y}, {z}, {world}, {size}\n" +
                "/brush erode [radius=5]\n" +
                "权限： worldedit.brush.erode\n" +
                "说明： 侵蚀地形\n" +
                "/brush pull [radius=5]\n" +
                "权限： worldedit.brush.pull\n" +
                "说明： 将地形朝着你所在的方向隆起\n" +
                "/brush blendball [radius=5]\n" +
                "权限： worldedit.brush.blendball\n" +
                "说明： 平滑化，混合化地形\n" +
                "图片： https://i.imgur.com/cNUQUkj.png -> https://i.imgur.com/hFOFsNf.png\n" +
                "/brush stencil <pattern> [radius=5] [file|#clipboard|imgur=null] [rotation=360] [yscale=1.0]\n" +
                "权限： worldedit.brush.stencil\n" +
                "说明： 使用高度图来绘制出地形表面。\n" +
                "-w 标记仅会应用于最大饱和度\n" +
                "-r 标记会应用随机旋转\n" +
                "/brush splatter <pattern> [radius=5] [seeds=1] [recursion=5] [solid=true]\n" +
                "权限： worldedit.brush.splatter\n" +
                "说明： 设置物体表面为随机方块。\n" +
                "图片： https://i.imgur.com/hMD29oO.png\n" +
                "使用示例： /br splatter stone,dirt 30 15\n" +
                "注意：种子决定着会有多少斑点，递归次数决定着其大小，solid决定着模型是按照每个种子应用还是按照每个方块应用。\n" +
                "/brush cylinder <block> [radius=2] [height=1] [-h]\n" +
                "权限： worldedit.brush.cylinder\n" +
                "说明： 创建圆柱体。\n" +
                "-h 标记会创建中空的圆柱体。");
        user.sendMessage("/brush shatter <pattern> [radius=10] [count=10] \n" +
                "权限： worldedit.brush.shatter\n" +
                "说明： 创建将地形分成多个部分的不均匀的线\n" +
                "图片： https://i.imgur.com/2xKsZf2.png\n" +
                "/brush circle <pattern> [radius=5]\n" +
                "权限： worldedit.brush.sphere\n" +
                "说明： 围绕着你看向的方向创建一个圆。\n" +
                "注意：无视笔刷的半径，并且启用预览可以帮助你操作的可能结果\n" +
                "/brush smooth [size=2] [iterations=4] [-n]\n" +
                "权限： worldedit.brush.smooth\n" +
                "说明： 选择地形平滑化笔刷。\n" +
                "-n 标记会只更改自然生成的方块。\n" +
                "/brush ex [radius=5]\n" +
                "权限： worldedit.brush.ex\n" +
                "说明： 火焰熄灭笔刷的简写\n" +
                "/brush gravity [radius=5] [-h]\n" +
                "权限： worldedit.brush.gravity\n" +
                "说明： 这个笔刷会模仿重力的作用。\n" +
                "-h 标记能够让它从世界的最大Y坐标开始计算，而不是点击方块的Y坐标。\n" +
                "/brush sspl <pattern> [size=0] [tension=0] [bias=0] [continuity=0] [quality=10]\n" +
                "权限： worldedit.brush.surfacespline\n" +
                "说明： 在地面上创建一条曲线。\n" +
                "视频： https://www.youtube.com/watch?v=zSN-2jJxXlM\n" +
                "/brush spline <pattern>\n" +
                "权限： worldedit.brush.spline\n" +
                "说明： 点击一些物体，然后再次点击相同的方块来让你的物体之间进行连接。\n" +
                "笔刷半径设置过小，或是点击位置错误或导致变形。形状必须是简单的线条或者封闭的环形。\n" +
                "图片： http://i.imgur.com/CeRYAoV.jpg -> http://i.imgur.com/jtM0jA4.png\n" +
                "图片2： http://i.imgur.com/bUeyc72.png -> http://i.imgur.com/tg6MkcF.png\n" +
                "/brush surface <pattern> [radius=5]\n" +
                "权限： worldedit.brush.surface\n" +
                "说明： 使用高度图来画出表面。\n" +
                "-w 标记仅会应用于最大饱和度\n" +
                "-r 标记会应用随机旋转\n" +
                "/brush layer <radius> [color|<pattern1> <patern2>...]\n" +
                "权限： worldedit.brush.layer\n" +
                "说明： 使用覆盖层来替换地形。\n" +
                "示例：/br layer 5 95:1 95:2 35:15 - 会在地面上放置一些覆盖层\n" +
                "图片： https://i.imgur.com/XV0vYoX.png\n" +
                "/brush sphere <pattern> [radius=2] [-h]\n" +
                "权限： worldedit.brush.sphere\n" +
                "说明： 创建一个球体。\n" +
                "-h 标记能够创建中空的球体。\n" +
                "/brush clipboard\n" +
                "权限： worldedit.brush.clipboard\n" +
                "说明： 选择剪切板笔刷。\n" +
                "-a 标记会使其不会粘贴空气方块。\n" +
                "不输入 -p 标记，粘贴后的内容的中心会出现在目标位置。输入该标记后，粘贴内容所在的位置就会根据你在复制内容时所站的位置而定义了。\n" +
                "/brush recursive <pattern-to> [radius=5]\n" +
                "权限： worldedit.brush.recursive\n" +
                "说明： 设置所有连接起来的方块。\n" +
                "-d 标记会应用深度优先的顺序\n" +
                "注意：设置蒙版可以递归指定的方块\n" +
                "/brush scatter <pattern> [radius=5] [points=5] [distance=1] [-o]\n" +
                "权限： worldedit.brush.scatter\n" +
                "说明： 在地面上随机散布方块。\n" +
                "-o 标记会覆盖原方块\n" +
                "视频： https://youtu.be/RPZIaTbqoZw?t=34s\n" +
                "/brush line <pattern> [radius=0] [-h] [-s] [-f]\n" +
                "权限： worldedit.brush.line\n" +
                "说明： 创建线段。\n" +
                "-h 标记仅会创建其外壳\n" +
                "-s 标记在创建之后会选择点击的点。\n" +
                "-f 标记会创建平坦的线段。");
        user.sendMessage("/brush height [radius=5] [file|#clipboard|imgur=null] [rotation=0] [yscale=1.00] [-h]\n" +
                "权限： worldedit.brush.height\n" +
                "说明： 这个笔刷可以使地形上升或下降。\n" +
                "- -r 标记启用随机坐标旋转\n" +
                "- -l 标记使得该笔刷也会在雪层中工作\n" +
                "- -s 标记禁用平滑\n" +
                "注意！注意！如果你要降低地形的话请将yscale的值设置为负数！\n" +
                "在雪层中应用的图片： https://i.imgur.com/Hrzn0I4.png\n" +
                "/brush butcher [radius=5] [-p] [-l] [-a] [-n] [-g] [-b] [-t] [-f] [-r]\n" +
                "权限： worldedit.brush.butcher\n" +
                "说明： 击杀在指定的半径内的怪物。\n" +
                "可用的标记：\n" +
                "-p 也击杀宠物\n" +
                "-n 也击杀 NPC\n" +
                "-g 也击杀铁傀儡\n" +
                "-a 也击杀动物。\n" +
                "-b 也击杀中立生物\n" +
                "-t 也击杀带有名字的怪物\n" +
                "-f 相当于这以前所有标记的混合\n" +
                "-r 也击杀盔甲架\n" +
                "-l 目前无任何作用\n" +
                "/brush flatten [radius=5] [file|#clipboard|imgur=null] [rotation=0] [yscale=1.00] [-h]\n" +
                "权限： worldedit.brush.height\n" +
                "说明： 平坦笔刷，可以使地形平坦\n" +
                "- -r 标记启用随机坐标旋转\n" +
                "- -l 标记使得该笔刷也会在雪层中工作\n" +
                "- -s 标记禁用平滑\n" +
                "/brush cliff [radius=5] [file|#clipboard|imgur=null] [rotation=0] [yscale=1.00] [-h]\n" +
                "权限： worldedit.brush.height\n" +
                "说明： 这个笔刷可以平坦地形且创建悬崖。\n" +
                "- -r 标记启用随机坐标旋转\n" +
                "- -l 标记使得该笔刷也会在雪层中工作\n" +
                "- -s 标记禁用平滑");
    }

    @Required("fawe.warn.question")
    @Filter("/tool")
    public void tool(XiaomingUser user) {
        user.sendError("消息过长，我已经通过私信调用给你了QAQ");
        user.sendPrivateMessage("/tool tree [type]\n" +
                "权限： worldedit.tool.tree\n" +
                "说明： 生成树的工具\n" +
                "/tool repl <block>\n" +
                "权限： worldedit.tool.replacer\n" +
                "说明： 方块替换工具\n" +
                "/tool info\n" +
                "权限： worldedit.tool.info\n" +
                "说明： 方块信息工具\n" +
                "/tool lrbuild <leftclick block> <rightclick block>\n" +
                "权限： worldedit.tool.lrbuild\n" +
                "说明： 大范围建筑工具\n" +
                "/tool cycler\n" +
                "权限： worldedit.tool.data-cycler\n" +
                "说明： 方块数据值循环工具\n" +
                "/tool deltree\n" +
                "权限： worldedit.tool.deltree\n" +
                "说明： 移除漂浮的树的工具\n" +
                "/tool inspect\n" +
                "权限： worldedit.tool.inspect\n" +
                "说明： 选择检查笔刷\n" +
                "/tool floodfill <pattern> <range>\n" +
                "权限： worldedit.tool.flood-fill\n" +
                "说明： 池塘填充工具\n" +
                "/tool farwand\n" +
                "权限： worldedit.tool.farwand\n" +
                "说明： 远程选区工具\n");
    }

    @Required("fawe.warn.question")
    @Filter("/anvil")
    public void anvil(XiaomingUser user) {
        user.sendError("消息过长，我已经通过私信调用发送给你啦QAQ");
        user.sendPrivateMessage("/anvil count <ids> [-d]\n" +
                "权限： worldedit.anvil.count\n" +
                "说明： 为选区中的方块计数\n" +
                "/anvil replace [from-block] <to-block>\n" +
                "权限： worldedit.anvil.replace\n" +
                "说明： 用一种方块替换选区中的所有另一种方块\n" +
                "/anvil replaceall <folder> [from-block] <to-block> [-d] [-f]\n" +
                "权限： worldedit.anvil.replaceall\n" +
                "说明： 用另一种方块替换选区中的所有方块\n" +
                "-d 标记会禁用通配符的匹配\n" +
                "/anvil copy\n" +
                "权限： worldedit.anvil.copychunks\n" +
                "说明： 将区块延迟复制到你的anvil剪切板中\n" +
                "/anvil paste [-c]\n" +
                "权限： worldedit.anvil.pastechunks\n" +
                "说明： 从anvil剪切板将内容粘贴出来。\n" +
                "-c 标记会调整将内容粘贴到区块中。\n" +
                "/anvil distr\n" +
                "权限： worldedit.anvil.distr\n" +
                "说明： 用另一种方块替换选区中的所有方块\n" +
                "/anvil trimallplots\n" +
                "权限： worldedit.anvil.trimallplots\n" +
                "说明： 修剪地皮世界中的区块\n" +
                "未认领的区块会被删除\n" +
                "未修改的区块会被删除\n" +
                "使用 -v 来删除没有人去过的区块\n" +
                "/anvil countall <folder> [hasSky] <id> [-d]\n" +
                "权限： worldedit.anvil.countall\n" +
                "说明： 为世界中的方块计数\n" +
                "/anvil clear\n" +
                "权限： worldedit.anvil.clear\n" +
                "说明： 清除选区的区块（不整理磁盘碎片，直接删除）\n" +
                "/anvil removelayers <id>\n" +
                "权限： worldedit.anvil.removelayer\n" +
                "说明： 如果某一区块的顶层方块全部都与提供的方块类型匹配成功的话，就移除顶层方块。\n" +
                "/anvil replacepattern [from-mask] <to-pattern>\n" +
                "权限： worldedit.anvil.replace\n" +
                "说明： 移除选区内所有匹配对应样式模板的方块\n" +
                "/anvil remapall <folder>\n" +
                "权限： worldedit.anvil.remapall\n" +
                "说明： 将世界在MCPE和PC的存档格式之间转换\n" +
                "/anvil deletealloldregions <folder> <time>\n" +
                "权限： worldedit.anvil.deletealloldregions\n" +
                "说明： 移除一段时间内没有人进入的区域\n" +
                "你可以使用秒 (s), 分钟 (m), 小时 (h), 天 (d), 周 (w),和 年 (y) 来计算时间\n" +
                "(请注意：月份不是计算时间的单位)\n" +
                "举个例子： 8h5m12s\n" +
                "/anvil replaceallpattern <folder> [from-block] <to-pattern> [-d] [-m]\n" +
                "权限： worldedit.anvil.replaceall\n" +
                "说明： 将选区中所有的方块替换成另一种方块样式\n" +
                "/anvil deleteallunvisited <folder> <age-ticks> [file-age=60000]\n" +
                "权限： worldedit.anvil.deleteallunvisited\n" +
                "说明： 会将满足以下条件之一的全部区块移除： 加载时间没有到指定整数游戏刻的区块(20t = 1s)；\n" +
                "在创建后，持续时间 file-duration (ms) 内没有被玩家访问的；\n" +
                "在过去的 chunk-inactivity (ms)时间中没有被使用的。 因此，我们推荐的自动保存时间间隔便是 file-duration 和 chunk-inactivity 的值。");
    }

    @Required("fawe.warn.question")
    @Filter("/schematic")
    public void schemtic(XiaomingUser user) {
        user.sendError("消息过长，我已经通过私信调用发送给你啦QAQ");
        user.sendPrivateMessage("/schematic load [<format>] <filename>\n" +
                "权限： worldedit.clipboard.load, worldedit.schematic.load, worldedit.schematic.upload, worldedit.schematic.load.other\n" +
                "说明： 将某个schematic文件导入到你的剪切板中\n" +
                "/schematic delete <filename>\n" +
                "权限： worldedit.schematic.delete\n" +
                "说明： 将某个schematic文件从文件列表中移除\n" +
                "/schematic list [mine|<filter>] [page=1] [-d] [-n] [-p]\n" +
                "权限： worldedit.schematic.list\n" +
                "说明： 列出所有schematic路径下的可用文件\n" +
                "-p <页码数> 能够列出指定页面的文件\n" +
                "-f <format> 启用格式限制\n" +
                "/schematic save [<format>] <filename>\n" +
                "权限： worldedit.clipboard.save, worldedit.schematic.save, worldedit.schematic.save.other\n" +
                "说明： 将你的剪切板中的内容储存到schematic文件中\n" +
                "/schematic remap\n" +
                "权限： worldedit.schematic.remap\n" +
                "说明： 将剪切板在MCPE/PC的格式间进行转换\n" +
                "/schematic formats\n" +
                "权限： worldedit.schematic.formats\n" +
                "说明： 列出所有可用的格式\n" +
                "/schematic loadall [<format>] <filename|url>\n" +
                "权限： worldedit.clipboard.load, worldedit.schematic.load, worldedit.schematic.upload\n" +
                "说明： 读取多个剪切板\n" +
                "-r 标记可以启用随机位置旋转");
    }

    @Required("fawe.question")
    @Filter("/sp")
    @Filter("/superpickaxe")
    public void superpickaxe(XiaomingUser user) {
        user.sendMessage("/sp recur <radius>\n" +
                "权限： worldedit.superpickaxe.recursive\n" +
                "说明： 启用递归超级镐子模式\n" +
                "/sp area <radius>\n" +
                "权限： worldedit.superpickaxe.area\n" +
                "说明： 启用区域超级镐子模式\n" +
                "/sp single\n" +
                "权限： worldedit.superpickaxe\n" +
                "说明： 启用单个方块的超级镐子模式\n");
    }

    @Required("fawe.question")
    @Filter("//getlighting")
    public void getlighting(XiaomingUser user) {
        user.sendMessage("//getlighting\n" +
                "权限： worldedit.light.fix\n" +
                "说明： 获取某位置的亮度信息");
    }

    @Required("fawe.question")
    @Filter("//overlay")
    public void overlay(XiaomingUser user) {
        user.sendMessage("//overlay <block>\n" +
                "权限： worldedit.region.overlay\n" +
                "说明： 在给定区域的顶层方块上方覆盖给定方块\n");
    }

    @Required("fawe.question")
    @Filter("//wea")
    public void wea(XiaomingUser user) {
        user.sendMessage("//wea\n" +
                "权限： fawe.admin\n" +
                "说明： 跳过区域的权限检测限制");
    }

    @Required("fawe.question")
    @Filter("//wer")
    public void wer(XiaomingUser user) {
        user.sendMessage("//wer\n" +
                "权限： fawe.worldeditregion\n" +
                "说明： 将当前你有权限更改的区域设为选区");
    }

    @Required("fawe.question")
    @Filter("//fixlighting")
    public void fixlighting(XiaomingUser user) {
        user.sendMessage("//fixlighting\n" +
                "权限： worldedit.light.fix\n" +
                "说明： 修复某位置的光照\n");
    }

    @Required("fawe.question")
    @Filter("//removelight")
    public void removelight(XiaomingUser user) {
        user.sendMessage("//removelight\n" +
                "权限： worldedit.light.remove\n" +
                "说明： 移除选区中的光照");
    }

    @Required("fawe.question")
    @Filter("//curve")
    public void curve(XiaomingUser user) {
        user.sendMessage("//curve <block> [thickness] [-h]\n" +
                "权限： worldedit.region.curve\n" +
                "说明： 过选择的点画一条曲线。\n" +
                "只能在使用凸多面体选区类型时才能使用。\n" +
                "-h 仅会生成外壳");
    }

    @Required("fawe.question")
    @Filter("//naturalize")
    public void naturalize(XiaomingUser user) {
        user.sendMessage("//naturalize\n" +
                "权限： worldedit.region.naturalize\n" +
                "说明： 顶层覆盖3层泥土，下面填充为石头");
    }

    @Required("fawe.question")
    @Filter("//walls")
    public void walls(XiaomingUser user) {
        user.sendMessage("//walls <block>\n" +
                "权限： worldedit.region.walls\n" +
                "说明： 围上选区的四边，即将选区用墙围起来");
    }

    @Required("fawe.question")
    @Filter("//setblocklight")
    public void setblocklight(XiaomingUser user) {
        user.sendMessage("//setblocklight\n" +
                "权限： worldedit.light.set\n" +
                "说明： 设置选区中的方块亮度");
    }

    @Required("fawe.question")
    @Filter("//lay")
    public void lay(XiaomingUser user) {
        user.sendMessage("//lay <block>\n" +
                "权限： worldedit.region.overlay\n" +
                "说明： 设置选区的顶层方块");
    }

    @Required("fawe.question")
    @Filter("//move")
    public void move(XiaomingUser user) {
        user.sendMessage("//move [count] [direction] [leave-id] [-s]\n" +
                "权限： worldedit.region.move\n" +
                "说明： 将选区中的内容移动。.\n" +
                "-s 标记会将选区设定到目标位置。\n" +
                "-b 也会复制生物群系\n" +
                "-e 忽略实体\n" +
                "-a 忽略空气\n" +
                "自动使用 <leave-id> 填充被移动区域。");
    }

    @Required("fawe.question")
    @Filter("/masks")
    public void masks2(XiaomingUser user) {
        user.sendMessage("/masks [page=1|search|mask]\n" +
                "说明： 查看所有用来决定方块能否被放置的蒙版\n" +
                "使用[括号]来输入参数\n" +
                "使用 , 来代表 或 的分割\n" +
                "使用 & 来表示 和 的分割\n" +
                "举个例子： >[stone,dirt],#light[0][5],$jungle\n" +
                "更多信息: https://git.io/v9r4K\n");
    }

    @Required("fawe.question")
    @Filter("/smask")
    public void smask(XiaomingUser user) {
        user.sendMessage("/smask [mask]\n" +
                "权限： worldedit.brush.options.mask\n" +
                "说明： 设置笔刷的资源蒙版");
    }

    @Required("fawe.question")
    @Filter("/secondary")
    public void secondary(XiaomingUser user) {
        user.sendMessage("/secondary [brush arguments]\n" +
                "说明： 设置左键点击激活的笔刷");
    }

    @Required("fawe.question")
    @Filter("/scroll")
    public void scroll(XiaomingUser user) {
        user.sendMessage("/scroll [none|clipboard|mask|pattern|range|size|visual|target]\n" +
                "说明： 在不同的目标模式之间进行切换");
    }

    @Required("fawe.question")
    @Filter("/visualize")
    public void visualize(XiaomingUser user) {
        user.sendMessage("/visualize [默认为0]\n" +
                "说明： 在不同的预览模式之间进行切换\n" +
                "0 = 没有预览\n" +
                "1 = 预览单个目标方块\n" +
                "2 = 用玻璃预览所有将会改变的方块");
    }

    @Required("fawe.question")
    @Filter("/none")
    public void none(XiaomingUser user) {
        user.sendMessage("/none\n" +
                "说明： 从当前物品上解除绑定功能");
    }

    @Required("fawe.question")
    @Filter("/targetmask")
    public void targetmask(XiaomingUser user) {
        user.sendMessage("/targetmask [mask]\n" +
                "说明： 设置目标蒙版");
    }

    @Required("fawe.question")
    @Filter("//")
    public void superopen(XiaomingUser user) {
        user.sendMessage("// [on|off]\n" +
                "权限： worldedit.superpickaxe\n" +
                "说明： 切换是否开启超级镐子功能\n");
    }

    @Required("fawe.question")
    @Filter("/primary")
    public void primary(XiaomingUser user) {
        user.sendMessage("/primary [brush arguments]\n" +
                "说明： 设置右键点击激活的笔刷");
    }

    @Required("fawe.question")
    @Filter("/transforms")
    public void transforms2(XiaomingUser user) {
        user.sendMessage("/transforms [page=1|search|transform]\n" +
                "说明： 变换方块被放置的方式\n" +
                "使用[括号]来输入参数\n" +
                "使用 , 来代表 或 的分割\n" +
                "使用 & 来表示 和 的分割\n" +
                "更多信息: https://git.io/v9KHO");
    }

    @Required("fawe.question")
    @Filter("/loadbrush")
    public void loadbrush(XiaomingUser user) {
        user.sendMessage("/loadbrush [name]\n" +
                "权限： worldedit.brush.load\n" +
                "说明： 读取笔刷");
    }

    @Required("fawe.question")
    @Filter("/savebrush")
    public void savebrush(XiaomingUser user) {
        user.sendMessage("/savebrush [name]\n" +
                "权限： worldedit.brush.save\n" +
                "说明： 保存你当前的笔刷\n" +
                "使用 -g 标记以储存到全局\n");
    }

    @Required("fawe.question")
    @Filter("/patterns")
    public void patterns(XiaomingUser user) {
        user.sendMessage("/patterns [page=1|search|pattern]\n" +
                "说明： 决定被放置的方块样式\n" +
                "使用[括号]来输入参数\n" +
                "使用 , 来代表 或 的分割\n" +
                "例如： #surfacespread[10][#existing],andesite\n" +
                "更多信息: https://git.io/vSPmA\n");
    }

    @Required("fawe.question")
    @Filter("/mat")
    public void mat(XiaomingUser user) {
        user.sendMessage("/mat [pattern]\n" +
                "权限： worldedit.brush.options.material\n" +
                "说明： 设置笔刷的填充方块样式");
    }

    @Required("fawe.question")
    @Filter("/transform")
    public void transform(XiaomingUser user) {
        user.sendMessage("/transform [transform]\n" +
                "权限： worldedit.brush.options.transform\n" +
                "说明： 设置笔刷的变换式");
    }

    @Required("fawe.question")
    @Filter("/generatebiome")
    public void generatebiome(XiaomingUser user) {
        user.sendMessage("//generatebiome <biome> <expression> [-h] [-r] [-o] [-c]\n" +
                "权限： worldedit.generation.shape, worldedit.biome.set\n" +
                "说明： 根据表达式创建结构，表达式返回的值\n" +
                "应该是正数（返回true，如果选择点在结构内的话）\n" +
                "作为选择项，你可以设置目标方块的类型或数据。\n" +
                "可选参数：\n" +
                "-h 创建凹下去的结构\n" +
                "-r 使用原版Minecraft坐标\n" +
                "-o 与 -r 相似，但使用相对坐标。\n" +
                "-c 与 -r 相似，但相对坐标的中心不同。\n" +
                "如果你既没有没有输入 -r ，也没有输入 -o 的话，选区会自动映射为 -1..1\n" +
                "详见 tinyurl.com/wesyntax。");
    }

    @Required("fawe.question")
    @Filter("/biomeinfo")
    public void biomeinfo(XiaomingUser user) {
        user.sendMessage("/biomeinfo [-p] [-t]\n" +
                "权限： worldedit.biome.info\n" +
                "说明： 获取当前位置的生物群系。\n" +
                "默认来说，我们会检测你选区中所有的方块，列出所有包含的生物群系。\n" +
                "-t 则检测你目光指向的那个区块。\n" +
                "-p 会检查你当前所在的区块。");
    }

    @Required("fawe.question")
    @Filter("/setbiome")
    public void setbiome(XiaomingUser user) {
        user.sendMessage("//setbiome <biome> [-p]\n" +
                "权限： worldedit.biome.set\n" +
                "说明： 设置区域的生物群系。\n" +
                "默认来说，我们会将你选区中的所有方块直接设置为对应生物群系。\n" +
                "-p 标记则将选区所在区块设置为对应生物群系。");
    }

    @Required("fawe.question")
    @Filter("/hsphere")
    public void hsphere(XiaomingUser user) {
        user.sendMessage("//hsphere <block> <radius>[,<radius>,<radius>] [raised?]\n" +
                "权限： worldedit.generation.sphere\n" +
                "说明： 生成中空的球体。\n" +
                "通过指定用逗号分隔的三个半径，\n" +
                "你能够创建椭球体。椭球体半径的距离的指定顺序为：\n" +
                "南北，上下，东西。\n");
    }

    @Required("fawe.question")
    @Filter("/hcyl")
    public void hcyl(XiaomingUser user) {
        user.sendMessage("//hcyl <pattern> <radius>[,<radius>] [height]\n" +
                "权限： worldedit.generation.cylinder\n" +
                "说明： 生成中空的圆柱体。\n" +
                "通过指定用逗号分隔的两个半径，\n" +
                "你能够创建椭圆体。\n" +
                "第一个参数指定南北距离，第二个参数指定东西距离。");
    }

    @Required("fawe.question")
    @Filter("/caves")
    public void caves(XiaomingUser user) {
        user.sendMessage("//caves [size=8] [freq=40] [rarity=7] [minY=8] [maxY=127] [sysFreq=1] [sysRarity=25] [pocketRarity=0] [pocketMin=0] [pocketMax=3]\n" +
                "权限： worldedit.generation.caves\n" +
                "说明： 生成网状的洞穴结构");
    }

    @Required("fawe.question")
    @Filter("/generate")
    public void generate(XiaomingUser user) {
        user.sendMessage("//generate <block> <expression> [-h] [-r] [-o] [-c]\n" +
                "权限： worldedit.generation.shape\n" +
                "说明： 根据表达式创建结构，表达式返回的值\n" +
                "应该是正数（返回true，如果选择点在结构内的话）\n" +
                "作为可选项，你可以设置目标方块的类型或数据。\n" +
                "可选参数：\n" +
                "-h 创建凹下去的结构\n" +
                "-r 使用原版Minecraft坐标\n" +
                "-o 与 -r 相似，但使用相对坐标。\n" +
                "-c 与 -r 相似，但相对坐标的中心不同。\n" +
                "如果你既没有没有输入 -r ，也没有输入 -o 的话，选区会自动映射为 -1..1\n" +
                "详见 tinyurl.com/wesyntax。\n");
    }

    @Required("fawe.question")
    @Filter("/sphere")
    public void sphere(XiaomingUser user) {
        user.sendMessage("//sphere <block> <radius>[,<radius>,<radius>] [raised?] [-h]\n" +
                "权限： worldedit.generation.sphere\n" +
                "说明： 生成实心球。\n" +
                "通过指定用逗号分隔的三个半径，\n" +
                "你能够创建椭球体。椭球体半径的距离的指定顺序为：\n" +
                "南北，上下，东西。");
    }

    @Required("fawe.question")
    @Filter("/cyl")
    public void cyl(XiaomingUser user) {
        user.sendMessage("//cyl <block> <radius>[,<radius>] [height] [-h]\n" +
                "权限： worldedit.generation.cylinder\n" +
                "说明： 生成圆柱体。\n" +
                "通过指定用逗号分隔的两个半径，\n" +
                "你能够创建椭圆体。\n" +
                "第一个参数指定南北距离，第二个参数指定东西距离。");
    }

    @Required("fawe.question")
    @Filter("/lazycut")
    public void lazycut(XiaomingUser user) {
        user.sendMessage("//lazycut [-e] [-m]\n" +
                "权限： worldedit.clipboard.lazycut\n" +
                "说明： 将选区中的内容延迟剪切到剪切板之中\n" +
                "可用参数：\n" +
                "-e 跳过复制实体\n" +
                "-m 设置资源蒙版，蒙版外的方块会作为空气复制\n" +
                "-b 也会复制生物群系\n" +
                "警告：实体的粘贴不能通过命令撤销！");
    }

    @Required("fawe.question")
    @Filter("//paste")
    public void paste(XiaomingUser user) {
        user.sendMessage("//paste [-s] [-a] [-o]\n" +
                "权限： worldedit.clipboard.paste\n" +
                "说明： 粘贴剪切板的内容。\n" +
                "可用参数：\n" +
                "-a 跳过空气方块\n" +
                "-b 跳过粘贴生物群系\n" +
                "-e 跳过粘贴实体\n" +
                "-o 粘贴到原位置\n" +
                "-s 在粘贴之后将选区设定在粘贴区域");
    }

    @Required("fawe.question")
    @Filter("//cut")
    public void cut(XiaomingUser user) {
        user.sendMessage("//cut [leave-id] [-e] [-m]\n" +
                "权限： worldedit.clipboard.cut\n" +
                "说明： 将选区剪切到粘贴板之中\n" +
                "可用参数：\n" +
                "-e 跳过复制实体\n" +
                "-m 设置资源蒙版，蒙版外的方块会作为空气复制\n" +
                "-b 也会复制生物群系\n" +
                "警告：实体的粘贴不能通过命令撤销！");
    }

    @Required("fawe.question")
    @Filter("//place")
    public void place(XiaomingUser user) {
        user.sendMessage("//place [-s] [-a] [-o]\n" +
                "权限： worldedit.clipboard.place\n" +
                "说明： 在不应用任何变化（如旋转）的前提下，直接放置剪切板中的内容。\n" +
                "可用参数：\n" +
                "-a 跳过空气方块\n" +
                "-o 粘贴在原位置\n" +
                "-s 粘贴之后将选区设定在粘贴区域");
    }

    @Required("fawe.question")
    @Filter("//lazycopy")
    public void lazycopy(XiaomingUser user) {
        user.sendMessage("//lazycopy [-e] [-m]\n" +
                "权限： worldedit.clipboard.lazycopy\n" +
                "说明： 将选区中的内容延迟复制到剪切板中\n" +
                "可用标记：\n" +
                "-e 跳过复制实体\n" +
                "-m 设置资源蒙版，蒙版外的方块会作为空气复制\n" +
                "-b 也会复制生物群系\n" +
                "警告：实体的粘贴不能通过命令撤销！");
    }

    @Required("fawe.question")
    @Filter("//rotate")
    public void rotate(XiaomingUser user) {
        user.sendMessage("//rotate <y-axis> [<x-axis>] [<z-axis>]\n" +
                "权限： worldedit.clipboard.rotate\n" +
                "说明： 在不产生破坏的情况下，旋转剪切板中的内容。\n" +
                "角度需要输入度数，正数代表进行顺时针旋转。你也可以堆叠进行多次旋转。我们并不接受非90度倍数的值，否则将不会起任何作用，所以输入的度数应该是90的倍数。");
    }
    @Required("fawe.question")
    @Filter("//copy")
    public void copy(XiaomingUser user){
        user.sendMessage("//copy [-e] [-m]\n" +
                "权限： worldedit.clipboard.copy\n" +
                "说明： 将选区中的内容复制到剪切板中\n" +
                "可用标记：\n" +
                "-e 跳过复制实体\n" +
                "-m 设置资源蒙版，蒙版外的方块会作为空气复制\n" +
                "-b 也会复制生物群系\n" +
                "警告：实体的粘贴不能通过命令撤销！");
    }
    @Required("fawe.question")
    @Filter("//forest")
    public void forest(XiaomingUser user){
        user.sendMessage("//forest [type] [density]\n" +
                "权限： worldedit.region.forest\n" +
                "说明： 在区域内生成森林");
    }
    @Required("fawe.question")
    @Filter("//flora")
    public void flora(XiaomingUser user){
        user.sendMessage("//flora [density]\n" +
                "权限： worldedit.region.flora\n" +
                "说明： 在区域内生成植物群");
    }
    @Required("fawe.question")
    @Filter("//defrom")
    public void defrom(XiaomingUser user){
        user.sendMessage("//deform <expression> [-r] [-o]\n" +
                "权限： worldedit.region.deform\n" +
                "说明： 使用给定的表达式使区域变形\n" +
                "表达式对每个方块都会执行，它可以\n" +
                "将方块的x，y，z修改到新方块的位置\n" +
                "来实现。详阅 tinyurl.com/wesyntax。");
    }
    @Required("fawe.question")
    @Filter("//regen")
    public void regen(XiaomingUser user){
        user.sendMessage("//regen [biome] [seed]\n" +
                "权限： worldedit.regen\n" +
                "说明： 重新生成当前选区中的地图。\n" +
                "注意：这条命令会按照区块为单位来执行，\n" +
                "即会自动将选区内的所有区块自动重新生成。");
    }
    @Required("fawe.question")
    @Filter("//cuont")
    public void count(XiaomingUser user){
        user.sendMessage("//count <block> [-d]\n" +
                "权限： worldedit.analysis.count\n" +
                "说明： 为当前选区中某种类型的方块计数");
    }
    @Required("fawe.question")
    @Filter("//searchitem")
    public void seachitem(XiaomingUser user){
        user.sendMessage("//searchitem <query> [-b] [-i]\n" +
                "说明： 搜索某个物品。\n" +
                "-b 仅搜索方块\n" +
                "-i 仅搜索物品");
    }
    @Required("fawe.question")
    @Filter("//distr")
    public void distr(XiaomingUser user) {
        user.sendMessage("//distr [-c] [-d]\n" +
                "权限： worldedit.analysis.distr\n" +
                "说明： 获得选区内方块的分布情况。\n" +
                "-c 标记会获得你剪切板内容的分布情况。\n" +
                "-d 标记会将数据值不同的方块分开统计");
    }
    @Required("fawe.question")
    @Filter("//outset")
    public void outset(XiaomingUser user){
        user.sendMessage("//outset <amount> [-h] [-v]\n" +
                "权限： worldedit.selection.outset\n" +
                "说明： 使用给定的数值，在所有方向上延展选区。\n" +
                "可用标记：\n" +
                "-h 仅会延展横向\n" +
                "-v 仅会延展纵向");
    }
    @Required("fawe.question")
    @Filter("//inset")
    public void inset(XiaomingUser user){
        user.sendMessage("//inset <amount> [-h] [-v]\n" +
                "权限： worldedit.selection.inset\n" +
                "说明： 使用给定的数值，在所有方向上缩小选区。\n" +
                "可用标记：\n" +
                "-h 仅会缩小横向\n" +
                "-v 仅会缩小纵向");
    }
    @Required("fawe.question")
    @Filter("//chunk")
    public void chunk(XiaomingUser user){
        user.sendMessage("//chunk [x,z coordinates] [-s] [-c]\n" +
                "权限： worldedit.selection.chunk\n" +
                "说明： 将选取范围设置为当前你所在的区块。\n" +
                "使用 -s 标记，则你目前选区范围会扩展到包含目前选区范围的全部区块\n" +
                "也可以使用给定的坐标，这会替代你的\n" +
                "当前位置。使用-c来指定区块坐标，\n" +
                "否则将自动使用全局坐标。\n" +
                "（举个例子，全局坐标5,5和 -c 0,0 所指代的位置是相同的）");
    }
    @Required("fawe.question")
    @Filter("//frb")
    public void frb(XiaomingUser user){
        user.sendMessage("//frb <user=qfys521> <radius=5> <time=3d4h>\n" +
                "权限： worldedit.history.rollback\n" +
                "说明： 撤销某个给定的操作。 - 时间使用以下单位： s（秒）, m（分钟）, h（小时）, d（天）, y（年）。\n" +
                "- 从硬盘中导入： /frb #import");
    }
    @Required("fawe.question")
    @Filter("/range")
    public void range(XiaomingUser user){
        user.sendMessage("/range [pattern]\n" +
                "权限： worldedit.brush.options.range\n" +
                "说明： 设置笔刷的范围");
    }
    @Required("fawe.question")
    @Filter("/mask")
    public void mask(XiaomingUser user){
        user.sendMessage("/mask [mask]\n" +
                "权限： worldedit.brush.options.mask\n" +
                "说明： 设置笔刷的目标蒙版");
    }
    @Required("fawe.question")
    @Filter("//listbrush")
    public void listbrush(XiaomingUser user){
        user.sendMessage("//listbrush [mine|<filter>] [page=1] [-d] [-n] [-p]\n" +
                "权限： worldedit.brush.list\n" +
                "说明： 列出或搜索所有你能使用的笔刷\n" +
                "-p <页码数> 列出指定页面");
    }
    @Required("fawe.question")
    @Filter("/size")
    public void size(XiaomingUser user){
        user.sendMessage("/size [pattern]\n" +
                "权限： worldedit.brush.options.size\n" +
                "说明： 设置笔刷大小");
    }
    @Required("fawe.question")
    @Filter("/target")
    public void target(XiaomingUser user){
        user.sendMessage("/target [mode]\n" +
                "说明： 在不同的目标模式之间切换");
    }
    @Required("fawe.question")
    @Filter("//fast")
    public void fast(XiaomingUser user){
        user.sendMessage("//fast [on|off]\n" +
                "权限： worldedit.fast\n" +
                "说明： 切换FAWE插件是否进入快速模式，在该模式下你的操作不会记录到相关历史记录中，即无法进行撤销操作");
    }
    @Required("fawe.question")
    @Filter("//gmask")
    public void gmask(XiaomingUser user){
        user.sendMessage("//gmask [mask]\n" +
                "权限： worldedit.global-mask\n" +
                "说明： 设置应用给你所有编辑的全局目标蒙版，与上面一个指令相对的，所有你的目标性更改均需通过本蒙版的判定（例如：判定能否修改世界中的方块）");
    }
    @Required("fawe.questionn")
    @Filter("//gsmask")
    public void gsmask(XiaomingUser user){
        user.sendMessage("//gsmask [mask]\n" +
                "权限： worldedit.global-mask\n" +
                "说明： 设置应用到你所有编辑的全局资源蒙版，任何作为源资源存储的方块数据均需要经过本蒙版判定（例如：判定方块能否被复制到剪切板中）");
    }
    @Required("fawe.question")
    @Filter("//tips")
    public void tips(XiaomingUser user){
        user.sendMessage("//tips\n" +
                "说明： 切换FAWE提示是否开启");
    }
    @Required("fawe.question")
    @Filter("//toggleplace")
    public void toggleplace(XiaomingUser user){
        user.sendMessage("//toggleplace\n" +
                "说明： 在你当前位置和第一个选取点之间切换位置");
    }
    @Required("fawe.question")
    @Filter("//gtransform")
    public void gtransform(XiaomingUser user){
        user.sendMessage("//gtransform [transform]\n" +
                "权限： worldedit.global-trasnform\n" +
                "说明： 获取全局变换式");
    }
    @Required("fawe.question")
    @Filter("/delchunks")
    public void delchunks(XiaomingUser user){
        user.sendMessage("\n" +
                "/delchunks\n" +
                "权限： worldedit.delchunks\n" +
                "说明： 已过期，请使用 anvil 命令来执行对应操作\n");
    }
    @Required("fawe.question")
    @Filter("/listchunks")
    public void listchunks(XiaomingUser user){
        user.sendMessage("/listchunks\n" +
                "权限： worldedit.listchunks\n" +
                "说明： 列出你的选区所在的所有区块");
    }
    @Required("fawe.question")
    @Filter("/chunkinfo")
    public void chunkinfo(XiaomingUser user){
        user.sendMessage("/chunkinfo\n" +
                "权限： worldedit.chunkinfo\n" +
                "说明： 获得你当前所在的区块的有关信息\n");
    }
    @Required("fawe.question")
    @Filter("/.s")
    public void cs1(XiaomingUser user){
        user.sendMessage("/.s [args...]\n" +
                "权限： worldedit.scripting.execute\n" +
                "说明： 执行上一个 CraftScript 脚本");
    }
    @Required("fawe.question")
    @Filter("/cs")
    public void cs2(XiaomingUser user){
        user.sendMessage("/cs <filename> [args...]\n" +
                "权限： worldedit.scripting.execute\n" +
                "说明： 执行一个 CraftScript 脚本");
    }
    @Required("fawe.question")
    @Filter("/restore")
    public void restore(XiaomingUser user){
        user.sendMessage("/restore [snapshot]\n" +
                "权限： worldedit.snapshots.restore\n" +
                "说明： 从某一快照恢复选区");
    }
    @Required("fawe.question")
    @Filter("/snapshotsel")
    public void snapshotsel(XiaomingUser user){
        user.sendMessage("/snapshotsel <index>\n" +
                "权限： worldedit.snapshots.restore\n" +
                "说明： 选择根据列表ID排序的某一快照");
    }
    @Required("fawe.question")
    @Filter("//siza")
    public void size2(XiaomingUser user){
        user.sendMessage("//size [-c]\n" +
                "权限： worldedit.selection.size\n" +
                "说明： 获取当前选区的信息");
    }
    @Required("fawe.question")
    @Filter("//expand")
    public void expand(XiaomingUser user){
        user.sendMessage("//expand <amount> [reverse-amount] <direction>\n" +
                "权限： worldedit.selection.expand\n" +
                "说明： 延展选区区域");
    }
    @Required("fawe.question")
    @Filter("//shift")
    public void shift(XiaomingUser user){
        user.sendMessage("//shift <amount> [direction]\n" +
                "权限： worldedit.selection.shift\n" +
                "说明： 移动选区区域");
    }
    @Required("fawe.question")
    @Filter("//sel")
    public void sel(XiaomingUser user){
        user.sendMessage("//sel [cuboid|extend|poly|ellipsoid|sphere|cyl|convex] [-d]\n" +
                "说明： 选择选区类型");
    }
    @Required("fawe.question")
    @Filter("//contract")
    public void contract(XiaomingUser user){
        user.sendMessage("//contract <amount> [reverse-amount] [direction]\n" +
                "权限： worldedit.selection.contract\n" +
                "说明： 缩小选区区域");
    }
    @Required("fawe.question")
    @Filter("//pos1")
    public void pos1(XiaomingUser user){
        user.sendMessage("//pos1 [coordinates]\n" +
                "权限： worldedit.selection.pos\n" +
                "说明： 设置选取点1");
    }
    @Required("fawe.question")
    @Filter("//pos2")
    public void pos2(XiaomingUser user){
        user.sendMessage("//pos2 [coordinates]\n" +
                "权限： worldedit.selection.pos\n" +
                "说明： 设置选取点2");
    }
    @Required("fawe.question")
    @Filter("//hpos1")
    public void hpos1(XiaomingUser user){
        user.sendMessage("//hpos1\n" +
                "权限： worldedit.selection.hpos\n" +
                "说明： 将选取点1设置为看向的方块");
    }
    @Required("fawe.question")
    @Filter("//wand")
    public void wand(XiaomingUser user){
        user.sendMessage("//wand\n" +
                "权限： worldedit.wand\n" +
                "说明： 获取Worldesit工具");
    }
    @Required("fawe.questio")
    @Filter("/toggleeditwand")
    public void toggleeditwand(XiaomingUser user){
        user.sendMessage("/toggleeditwand\n" +
                "权限： worldedit.wand.toggle\n" +
                "说明： 切换编辑魔杖功能的启用与否");
    }
    @Required("fawe.question")
    @Filter("//hpos2")
    public void hpos2(XiaomingUser user){
        user.sendMessage("//hpos2\n" +
                "权限： worldedit.selection.hpos\n" +
                "说明： 将选取点2设置为看向的方块\n");
    }
    @Required("fawe.question")
    @Filter("//redo")
    public void redo(XiaomingUser user){
        user.sendMessage("//redo [times] [player]\n" +
                "权限： worldedit.history.redo\n" +
                "说明： （从历史记录中）反撤销上个操作");
    }
    @Required("fawe.question")
    @Filter("//clearhistory")
    public void clearhistory(XiaomingUser user){
        user.sendMessage("//clearhistory\n" +
                "权限： worldedit.history.clear\n" +
                "说明： 清除你的历史记录");
    }
    @Required("fawe.question")
    @Filter("//undo")
    public void undo(XiaomingUser user){
        user.sendMessage("//undo [times] [player]\n" +
                "权限： worldedit.history.undo\n" +
                "说明： 撤销上个操作");
    }
    @Required("fawe.question")
    @Filter("//flip")
    public void flip(XiaomingUser user){
        user.sendMessage("//flip [<direction>]\n" +
                "权限： worldedit.clipboard.flip\n" +
                "说明： 以复制点为基点，对剪切板中的内容进行镜面翻转。");
    }
    @Required("fawe.question")
    @Filter("/download")
    public void download(XiaomingUser user){
        user.sendMessage("/download\n" +
                "权限： worldedit.clipboard.download\n" +
                "说明： 通过配置的网页接口下载剪切板的内容");
    }
    @Required("fawe.question")
    @Filter("/asset")
    public void asset(XiaomingUser user){
        user.sendMessage("/asset [category]\n" +
                "权限： worldedit.clipboard.asset\n" +
                "说明： 将你的剪切板的内容保存到网页资源接口中");
    }
    @Required("fawe.question")
    @Filter("/clearclipboard")
    public void clearclipboard(XiaomingUser user){
        user.sendMessage("/clearclipboard\n" +
                "权限： worldedit.clipboard.clear\n" +
                "说明： 清除你的剪切板");
    }
    @Required("fawe.question")
    @Filter("//image")
    public void image(XiaomingUser user){
        user.sendMessage("//image <imgur> [randomize=true] [complexity=100]\n" +
                "权限： worldedit.generation.image\n" +
                "说明： 创建一张图片");
    }
    @Required("fawe.question")
    @Filter("//ore")
    public void ore(XiaomingUser user){
        user.sendMessage("//ore <mask> <pattern> <size> <freq> <rarity> <minY> <maxY>\n" +
                "权限： worldedit.generation.ore\n" +
                "说明： 生成矿物");
    }
    @Required("fawe.question")
    @Filter("//ores")
    public void ores(XiaomingUser user){
        user.sendMessage("//ores\n" +
                "权限： worldedit.generation.ore\n" +
                "说明： 生成矿物");
    }
    @Required("fawe.question")
    @Filter("/forestgen")
    public void forestgen(XiaomingUser user){
        user.sendMessage("/forestgen [size] [type] [density]\n" +
                "权限： worldedit.generation.forest\n" +
                "说明： 生成森林");
    }
    @Required("fawe.question")
    @Filter("//hpyramid")
    public void hpyramid(XiaomingUser user){
        user.sendMessage("//hpyramid <block> <size>\n" +
                "权限： worldedit.generation.pyramid\n" +
                "说明： 生成中空的金字塔");
    }
    @Required("fawe.question")
    @Filter("/pumpkins")
    public void pumpkins(XiaomingUser user){
        user.sendMessage("/pumpkins [size]\n" +
                "权限： worldedit.generation.pumpkins\n" +
                "说明： 生成南瓜群\n");
    }
    @Required("fawe.question")
    @Filter("//pyramid")
    public void pyramid(XiaomingUser user){
        user.sendMessage("//pyramid <block> <size> [-h]\n" +
                "权限： worldedit.generation.pyramid\n" +
                "说明： 生成填充过的金字塔");
    }
    @Required("fawe.question")
    @Filter("/biomelist")
    public void biomelist(XiaomingUser user){
        user.sendMessage("/biomelist [page]\n" +
                "权限： worldedit.biome.list\n" +
                "说明： 获取所有可用的生物群系。");
    }
    @Required("fawe.question")
    @Filter("/descend")
    public void descend(XiaomingUser user){
        user.sendMessage("/descend [# of floors]\n" +
                "权限： worldedit.navigation.descend\n" +
                "说明： 向下降一层");
    }
    @Required("fawe.question")
    @Filter("/ascend")
    public void ascend(XiaomingUser user){
        user.sendMessage("/ascend [# of levels]\n" +
                "权限： worldedit.navigation.ascend\n" +
                "说明： 向上升一层");
    }
    @Required("fawe.question")
    @Filter("/thru")
    public void thru(XiaomingUser user){
        user.sendMessage("/thru\n" +
                "权限： worldedit.navigation.thru.command\n" +
                "说明： 穿过面前的墙壁");
    }
    @Required("fawe.question")
    @Filter("/jumpto")
    public void jumpto(XiaomingUser user){
        user.sendMessage("/jumpto [world,x,y,z]\n" +
                "权限： worldedit.navigation.jumpto.command\n" +
                "说明： 传送到某一位置");
    }
    @Required("fawe.question")
    @Filter("/ceil")
    public void ceil(XiaomingUser user){
        user.sendMessage("/ceil [clearance] [-f] [-g]\n" +
                "权限： worldedit.navigation.ceiling\n" +
                "说明： 前往当前的最顶层，即“天花板”上");
    }
    @Required("fawe.question")
    @Filter("/up")
    public void up(XiaomingUser user){
        user.sendMessage("/up <block> [-f] [-g]\n" +
                "权限： worldedit.navigation.up\n" +
                "说明： 向上移动一段距离，并在脚下生成方块");
    }
    @Required("fawe.question")
    @Filter("/unstuck")
    public void unstuck(XiaomingUser user){
        user.sendMessage("/unstuck\n" +
                "权限： worldedit.navigation.unstuck\n" +
                "说明： 在卡在方块中的情况下逃脱\n");
    }
    @Required("fawe.question")
    @Filter("/snapshotlist")
    public void snapshotlist(XiaomingUser user){
        user.sendMessage("/snapshotlist [num]\n" +
                "权限： worldedit.snapshots.list\n" +
                "说明： 列出快照列表的对应页数");
    }
    @Required("fawe.question")
    @Filter("/snapshotafter")
    public void snapshotafter(XiaomingUser user){
        user.sendMessage("/snapshotafter <date>\n" +
                "权限： worldedit.snapshots.restore\n" +
                "说明： 选择发布时间在该时间之后，距离时间最近的一个快照");
    }
    @Required("fawe.question")
    @Filter("/snapshotbefore")
    public void snapshotbefore(XiaomingUser user){
        user.sendMessage("/snapshotbefore <date>\n" +
                "权限： worldedit.snapshots.restore\n" +
                "说明： 选择发布时间在该时间之前，距离时间最近的一个快照");
    }
    @Required("fawe.question")
    @Filter("/snapshotuse")
    public void snapshotuse(XiaomingUser user){
        user.sendMessage("/snapshotuse <snapshot>\n" +
                "权限： worldedit.snapshots.restore\n" +
                "说明： 选择要使用的快照");
    }
}
