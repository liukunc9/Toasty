# Toasty
基于 GrenderG 的 Toasty 基础上，添加了 Toast 出现的位置的设置和 Toast 的背景透明度的设置

### 添加Gradle依赖

1.先在项目根目录的 build.gradle 的 repositories 添加:
```
allprojects {
     repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

2.然后在dependencies添加:

```
dependencies {
  ...
  implementation 'com.github.liukunc9:Toasty:1.0.0'
}
```

### 使用配置

如果想让 Toast 显示在屏幕中央，需要在 使用之前进行配置，建议放在 Application 中  
```
Toasty.Config.getInstance()
        .setGravity(Gravity.CENTER);  
```

### 使用示例

成功提示
```
Toasty.success(getContext(),"成功").show();
```

失败提示
```
Toasty.error(getContext(), "失败").show();
```

//其余类似

### 示例截图

![image](https://github.com/liukunc9/Toasty/blob/master/images/1.png)
![image](https://github.com/liukunc9/Toasty/blob/master/images/2.png)
![image](https://github.com/liukunc9/Toasty/blob/master/images/3.png)
![image](https://github.com/liukunc9/Toasty/blob/master/images/4.png)