# androidKotlin
# 《Kotlin for android developers》中文版翻译

> 错别字、病句、翻译错误等问题可以提issues。请说明错误原因。

1. [在线阅读或下载GitBook](https://www.gitbook.com/book/wangjiegulu/kotlin-for-android-developers-zh/details)
2. [在线阅读](https://github.com/wangjiegulu/kotlin-for-android-developers-zh/blob/master/SUMMARY.md)


希望大家购买正版，建议阅读英文原版：https://leanpub.com/kotlin-for-android-developers

- Github: https://github.com/wangjiegulu/kotlin-for-android-developers-zh

# 写在前面

学习通过Kotlin语言来简单地开发android应用。
# 关于本书

在这本书中，我会使用Kotlin作为主要的语言来开发一个android应用。方式是通过开发一个应用来学习这门语言，而不是根据传统的结构来学习。我会在感兴趣的点停下来通过与Java1.7对比的方式讲讲Kotlin的一些概念和特性。用这种方法你就能知道它们的不同之处，并且知道哪部分语言特性可以让你提高你的工作效率。

这本书并不是一本语言参考书，但它是一个Android开发者去学习Kotlin并且使用在自己项目中的一个工具。我会通过使用一些语言特性和有趣的工具和库来解决很多我们在日常生活当中都会遇到的典型问题。

这本书是非常具有实践性的，所以我建议你在电脑面前跟着我的例子和代码实践。无论何时你都可以在有一些想法的时候深入到实践中去。

就如你知道的，这是一个精益出版。也就是说这本书是跟你一起写下去的。我会根据你的回复和建议来写新的内容和检查之前的内容。尽管这本书已经完成了，但是我会及时根据新的Kotlin版本更新。所以尽管编写意见告诉我你对这本书的看法，或者需要改进的地方。我希望这本书会成为Android开发者的一个完美的工具，正因为如此，欢迎大家的想法和帮助。

感谢你将成为这个激动人心的项目的一部分。
# 这本书适合你吗？

写这本书是为了帮助那些有兴趣使用Kotlin语言来进行开发的Android开发者。

如果你符合下面这些情况，那这本书是适合你的：
- 你有相关Android开发和Android SDK的基本知识。
- 你希望跟随一个使用Kotlin语言编写的例子来学习Kotlin。
- 你需要一个怎么去使用更简洁生动的语言来解决日常生活遇到的典型问题的指南。

另一方面，这本书可能不太适合你，因为：
- 这本书不是Kotlin圣经。我会去解释所有Kotlin的基本语法，甚至包括在过程中遇到我需要的一些相对比较复杂的想法。所以你是通过一个例子去学习，而不是其他方式。
- 我不会去解释怎么样去开发一个Android应用。你不需要很深的开发知识，但是至少了解基础，比如Android Studio，Gradle，Java语言和Android SDK。你可能会从中学到一些关于Android开发的一些新的东西。
- 这本书不是函数式编程语言指南。当然由于Java 7完全不是函数式风格的，我会解释你需要知道的东西，但是不会很深入地去讲解函数式编程的话题。

# 关于作者

Antonio Leiva是一个Android工程师，他专注于研究新的潜在的Android开发可能性，然后写作说明。他维护一个关于很多不同Android开发话题的博客[antonioleiva.com]。

Antonio一开始是CRM技术顾问，但是一段时间之后，他寻找着新的激情，他发现了Android世界。在优秀的平台上获得了相关经验，之后他加入了一个西班牙重要的手机公司带领多个项目作为新的冒险。

现在，他在[Plex]担任Android工程师，并且在Android的设计和UX方面也担任重要的角色。

你可以在Twitter上关注他[@lime_cl]。

[antonioleiva.com]: http://antonioleiva.com/
[Plex]: http://plex.tv/
[@lime_cl]: https://twitter.com/lime_cl

# 介绍

如果你觉得Java 7是一个过期的语言，并决定找一个更现代的语言代替。恭喜你！就如你知道的，虽然Java 8已经发布了，它包含了很多我们期待的像现代语言中那样的改善，但是我们Android开发者还是被迫在使用Java 7.这是因为法律的问题。但是就算没有这个限制，并且新的Android设备从今天开始使用新的能理解Java8的VM，在当前的设备过期、几乎没有人使用它们之前我们也不能使用Java 8，所以恐怕我们不会很快等到这一天的到来。

但是并不是没有补救的方法。多亏使用了JVM，我们可以使用任何语言去编写Android应用，只要它能够编译成JVM能够认识的字节码就可以了。

正如你所想，有很多选择，比如Groovy，Scala，Clojure，当然还有Kotlin。通过实践，只有其中一些能够被考虑来作为替代品。

上述的每一种语言都有它的利弊，如果你还没有真正确定你该使用那种语言，我建议你可以去尝试一下它们。

# 什么是Kotlin？

Kotlin，如前面所说，它是[JetBrains]开发的基于JVM的语言。JetBrains因为创造了一个强大的Java开发IDE被大家所熟知。Android Studio，官方的Android IDE，就是基于Intellij，作为一个该平台的插件。

Kotlin是使用Java开发者的思维被创建的，Intellij作为它主要的开发IDE。对于Android开发者，有两个有趣的特点：
- 对Java开发者来说，Kotlin是非常直觉化的，并且非常容易学习。语言的大部分内容都是与我们知道的非常相似，不同的地方，它的基础概念也能迅速地掌握它。
- 它与我们日常生活使用的IDE完全免费地整合。Android Studio能够非常完美地理解、编译运行Kotlin代码。而且对这门语言的支持来正是自于开发了这个IDE的公司本身，所以我们Android开发者是一等公民。
 
但是这仅仅是开发语言和开发工具之间的整合。相比Java 7的优势到底是什么呢？
- 它更加易表现：这是它最重要的优点之一。你可以编写少得多的代码。
- 它更加安全：Kotlin是空安全的，也就是说在我们编译时期就处理了各种null的情况，避免了执行时异常。如果一个对象可以是null，则我们需要明确地指定它，然后在使用它之前检查它是否是null。你可以节约很多调试空指针异常的时间，解决掉null引发的bug。
- 它是函数式的：Kotlin是基于面向对象的语言。但是就如其他很多现代的语言那样，它使用了很多函数式编程的概念，比如，使用lambda表达式来更方便地解决问题。其中一个很棒的特性就是Collections的处理方式。
- 它可以扩展函数：这意味着我们可以扩展类的更多的特性，甚至我们没有权限去访问这个类中的代码。
- 它是高度互操作性的：你可以继续使用所有的你用Java写的代码和库，因为两个语言之间的互操作性是完美的。甚至可以在一个项目中使用Kotlin和Java两种语言混合编程。


[JetBrains]: https://www.jetbrains.com/

# 我们通过Kotlin得到什么

不深入Kotlin语言（我们会在下一章再去学习），这里有一些Java中没有的有趣的特性：

## 易表现

通过Kotlin，可以更容易地避免模版代码因为大部分的典型情况都在语言中默认覆盖实现了。举个例子，在Java中，如果我们要典型的数据类，我们需要去编写（至少生成）这些代码：
```java
public class Artist {
    private long id;
    private String name;
    private String url;
    private String mbid;

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMbid() {
        return mbid;
    }

    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    @Override public String toString() {
        return "Artist{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", url='" + url + '\'' +
          ", mbid='" + mbid + '\'' +
          '}';
    }
}
```

使用Kotlin，我们只需要通过数据类：
```kotlin
data class Artist(
    var id: Long,
    var name: String,
    var url: String,
    var mbid: String)
```

这个数据类，它会自动生成所有属性和它们的访问器，以及一些有用的方法，比如，`toString()`

## 空安全

当我们使用Java开发的时候，我们的代码大多是防御性的。如果我们不想遇到`NullPointerException`，我们就需要在使用它之前不停地去判断它是否为null。Kotlin，如很多现代的语言，是空安全的，因为我们需要通过一个`安全调用操作符`（写做`?`）来明确地指定一个对象是否能为空。

我们可以像这样去写：
```kotlin
// 这里不能通过编译. Artist 不能是null
var notNullArtist: Artist = null

// Artist 可以是 null
var artist: Artist? = null

// 无法编译, artist可能是null，我们需要进行处理
artist.print()

// 只要在artist != null时才会打印
artist?.print()

// 智能转换. 如果我们在之前进行了空检查，则不需要使用安全调用操作符调用
if (artist != null) {
  artist.print()
}

// 只有在确保artist不是null的情况下才能这么调用，否则它会抛出异常
artist!!.print()

// 使用Elvis操作符来给定一个在是null的情况下的替代值
val name = artist?.name ?: "empty"
```

## 扩展方法

我们可以给任何类添加函数。它比那些我们项目中典型的工具类更加具有可读性。举个例子，我们可以给fragment增加一个显示toast的函数：
```kotlin
fun Fragment.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) { 
    Toast.makeText(getActivity(), message, duration).show()
}
```
我们现在可以这么做：
```kotlin
fragment.toast("Hello world!")
```

## 函数式支持（Lambdas）

每次我们去声明一个点击所触发的事件，可以只需要定义我们需要做些什么，而不是不得不去实现一个内部类？我们确实可以这么做，这个（或者其它更多我们感兴趣的事件）我们需要感谢lambda：
```kotlin
view.setOnClickListener { toast("Hello world!") }
```
这里只是挑选了很小一部分Kotlin可以简化我们代码的事情。现在你已经知道这门语言的一些有趣的特性了，你可以考虑它是否是适合你的。如果你选择继续，我们将在下一章开始我们的实践之旅。

# 准备工作

现在你知道使用Kotlin实现的小例子了，我确信你会希望尽可能快地把它用在你的实践当中去。不要担心，在第一章中会帮助你去搭建你的开发环境，这样你才能立即编写代码。

# Android Studio

第一件事就是安装Android Studio。就如你知道的，Android Studio是官方的Android IDE，它是2013年发布的预览版，并在2014年发布了正式版。

Android Studio是[Intellij IDEA]的插件实现，Intellij IDEA是由[JetBrains]开发，Kotlin就是JetBrains创造的。所以，正如你所见，一切都这么紧密地结合起来了。

转移Android Studio是Android开发者一个重要的改变。首先，因为我们放弃了Eclipse并转到专为Java开发者设计的完美的语言交互的软件。我们可以享受到完美的特性体验，比如反应快速和令人影响深刻的智能代码提示，还有强大的分析和重构工具。

第二，[Gradle]成为Android官方的系统构建工具，这意味着版本构建和部署的新的可能性。最有趣的两点是系统构建和flavours，它可以让你使用相同的代码库来创建无限的版本（甚至是不同的应用）。

如果你仍然在使用Eclipse，为了跟上这本书，恐怕你需要转移到Android Studio了。Kotlin团队也创建了一个针对Eclipse的插件，但是它是远远落后于Android Studio的，而且结合得也并不完美。你一旦使用了它，你就会觉得相见恨晚。

我不会去覆盖到Android Studio和Gradle的使用，因为这些都不是本书的重点，但是如果你以前没有使用过这些工具，不要恐慌，我确信你能够跟随本书的同时学习到相关基础。

如果你还没有AndroidStudio，[点这里从官网下载](https://developer.android.com/sdk/index.html)。



[JetBrains]: https://www.jetbrains.com/
[Intellij IDEA]: https://www.jetbrains.com/idea
[Gradle]: https://gradle.org/

# 安装Kotlin插件

~~IDE它本身并不能理解Kotlin。就像前面部分讲到，它是为Java开发设计的。但是Kotlin团队创建了一系列强大的插件让我们更轻松地实现。前往Android Studio的`Preferences`中`Plugin`栏，然后安装如下两个插件：~~
- ~~Kotlin：这是一个基础的插件。它能让Android Studio懂得Kotlin代码。它会每次在新的Kotlin语言版本发布的时候发布新的插件版本，这样我们可以通过它发现新版本特性和弃用的警告。这是你要使用Kotlin编写Android应用唯一的插件。但是我们现在还需要另外一个。~~
- ~~Kotlin Android Extensions：Kotlin团队还为Android开发发布了另外一个有趣的插件。这个Android Extensions可以让你自动地从XML中注入所有的View到Activity中，举个例子，你不需要使用`findViewById()`。你将会立即得到一个从属性转换过来的view。你将需要安装这个插件来使用这个特性。我们会在下一章中深入地去讲解这个。~~

因为从Intellij 15开始，插件是被默认安装了的，但是你的Android Studio可能并没有。所以你需要进入Android Studio 的Preferences的plugin栏，然后安装Kotlin插件。如果你不会就去搜索下。

现在我们的环境已经可以理解Kotlin语言了，可以就像我们使用Java一样无缝地编译它，执行它。

# 创建一个新的项目

如果你已经使用过Android Studio和Gradle，那么这一章会比较简单。我不会给出很多细节和截图，因为用户界面和细节可能会一直变化。

我们的应用是由一个简单的天气app组成，正如所使用的[Google's Beginners Course in Udacity]。我们可能会关注不同的事情，但是app的想法都是一样的，你会发现在一个典型的app里面会包括很多不同的东西。如果你的Android开发水平比较低，我推荐这个，这个过程是比较容易的。


[Google's Beginners Course in Udacity]: https://www.udacity.com/course/android-development-for-beginners--ud837

# 在Android Studio中创建一个项目

首先，打开Android Studio并选择`Create new Project`，然后它会让你输入一个名字，你可以任意取一个名字，比如：`Weather App`。然后你需要输入公司域名。如果你不会真正发布这个app，这个字段就不是特别重要了，但是如果你有的话可以使用自己的域名。然后给任意选择一个目录作为这个项目的保存地址。

下一步，它会让你选择最小的API版本。我们选择API 15，因为我们有一个库需要至少API 15才能用。无论如何你把大部分的Anroid用户作为了目标。现在不要选择任何除了手机和平板的其它平台。

最后，我们需要选择一个Activity模版来作为入口。我们可以选择`Add no Activity`然后从头开始（这是一个好的方式如果这是一个Kotlin项目的话），但是我将选择`Blank Activity`，因为我待会儿会给你展示Kotlin插件一个好玩的小特性。

暂时不用去关心Activity的名字，layout等。这些你会在下一篇中知道。如果我们需要，我待会儿会修改它。点击`Finish`然后让它继续创建项目。

# 配置Gradle

Kotlin插件包括一个让我们配置Gradle的工具。但是我还是倾向于保持我对Gradle文件读写的控制权，否则它只会变得混乱而不会变得简单。不管怎么样，在使用自动工具之前知道它是怎么工作的是个不错的主意。所以这次，我们将手动去做。

首先，你需要如下修改父`build.gradle`：
```groovy
buildscript {
    ext.support_version = '23.1.1'
    ext.kotlin_version = '1.0.0'
    ext.anko_version = '0.8.2'
    repositories {
        jcenter()
        dependencies {
            classpath 'com.android.tools.build:gradle:1.5.0'
            classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        }
    }
}
allprojects {
    repositories {
        jcenter() 
    }
}
```
正如你看到的，我们创建了一个变量来存储当前的Kotlin版本。你读到这里的时候去检测一下最新版本，因为可能会有更新的版本已经发布了。我们需要在几个不同的地方用到那个版本号，比如你需要加上新的Kotlin插件的`dependency`。你会在你指定的那些模块中的`build.gradle`中再次需要到Kotlin标准库。

我们对于`support library`也是如此，`Anko`库也是同样的做法。用这个方式可以更方便地在一个地方修改所有的版本号。并且使用相同的版本号，更新的时候也不需要每个地方都修改。

我们会增加`Kotlin`标准库，`Anko`库，以及`Kotlin`和`Kotlin Android Extensions plugin`插件到dependencies。
```groovy
apply plugin: 'com.android.application'
apply plugin: 'kotlin-android'
apply plugin: 'kotlin-android-extensions'
android {
    ...
}

dependencies {
    compile "com.android.support:appcompat-v7:$support_version"
    compile "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    compile "org.jetbrains.anko:anko-common:$anko_version"
}

buildscript {
    repositories {
jcenter() }
    dependencies {
      classpath "org.jetbrains.kotlin:kotlin-android-extensions:$kotlin_version"
    } 
}
```
Anko是一个用来简化一些Android任务的很强大的Kotlin库。我们之后将会学习部分anko，但是现在来说仅仅增加`anko-common`就足够了。这个库被分割成了一系列小的部分以至于我们不会把没用到的部分加进来。

# 把MainActivity转换成Kotlin代码

Kotlin plugin包含了一个有趣的特性，它能把Java代码转成Kotlin代码。正如任何自动化那样，结果不会很完美，但是在你第一天能够使用Kotlin语言开始编写代码之前，它还是提供了很多的帮助。

所以我们在MainActivity.java类中使用它。打开文件，然后选择`Code` -> `Convert Java File to Kotlin File`。对比它们的不同之处，可以让你更熟悉这门语言。

# 把MainActivity转换成Kotlin代码

Kotlin plugin包含了一个有趣的特性，它能把Java代码转成Kotlin代码。正如任何自动化那样，结果不会很完美，但是在你第一天能够使用Kotlin语言开始编写代码之前，它还是提供了很多的帮助。

所以我们在MainActivity.java类中使用它。打开文件，然后选择`Code` -> `Convert Java File to Kotlin File`。对比它们的不同之处，可以让你更熟悉这门语言。

# 测试是否一切就绪

我们想再将编写一些代码来测试Kotlin Android Extensions是否在工作。我现在还不会对这些代码做解释，但是我想要确保它们在你的环境中是正常运行的。这可能是配置中最难的一部分。

首先，打开`activity_main.xml`，然后设置TextView的id：
```xml
<TextView
    android:id="@+id/message"
    android:text="@string/hello_world"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

然后，手动在Activity中增加一个import语句（不要担心你现在对这个还不太理解）。

```kotlin
import kotlinx.android.synthetic.main.activity_main.*
```

在`onCreate`中，你现在可以直接得到并访问这个TextView了。

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    message.text = "Hello Kotlin!"
}
```

多亏Kotlin和Java之间的互操作性，我们可以在Kotlin中像操作属性一样去操作Java库中的getter/setter方法。我们之后再去讲解属性，但是我想提醒的是，我们可以使用`message.text`来代替`message.setText`。编译器将会把它转换成一般的Java代码，所以这样使用是没有任何性能开销的。

现在运行这个app，并且它是正常运行的。检查TextView是否是显示的新的内容。如果你有疑问或者想查看代码，请在[Kotlin for Android Developers repository]查看。每个章节只要修改了代码，我都会进行提交，所以一定要检查所有的代码变化。

下一章会覆盖你在转换之后的MainActivity所看到的新的东西。一旦你理解了Java和Kotlin之间的细微的变化，你将能更容易独立写新的代码了。


[Kotlin for Android Developers repository]: https://github.com/antoniolg/Kotlin-for-Android-Developers

# 类和函数

Kotlin中的类遵循一个简单的结构。尽管与Java有一点细微的差别。你可以使用[try.kotlinlang.org]在不需要一个真正的项目和不需要部署到机器的前提下来测试一些简单的代码范例。

[try.kotlinlang.org]: http://try.kotlinlang.org/

# 怎么定义一个类

如果你想定义一个类，你只需要使用`class`关键字。
```kotlin
class MainActivity{

}
```

它有一个默认唯一的构造器。我们会在以后的课程中学习在特殊的情况下创建其它额外的构造器，但是请记住大部分情况下你只需要这个默认的构造器。你只需要在类名后面写上它的参数。如果这个类没有任何内容可以省略大括号：

```kotlin
class Person(name: String, surname: String)
```

那么构造函数的函数体在哪呢？你可以写在`init`块中：
```kotlin
class Person(name: String, surname: String) {
    init{
        ...
    }
}
```
# 类继承

默认任何类都是基础继承自`Any`（与java中的`Object`类似），但是我们可以继承其它类。所有的类默认都是不可继承的（final），所以我们只能继承那些明确声明`open`或者`abstract`的类：

```kotlin
open class Animal(name: String)
class Person(name: String, surname: String) : Animal(name)
```

当我们只有单个构造器时，我们需要在从父类继承下来的构造器中指定需要的参数。这是用来替换Java中的`super`调用的。

# 函数

函数（我们Java中的方法）可以使用`fun`关键字就可以定义:

```kotlin
fun onCreate(savedInstanceState: Bundle?) {
}
```

如果你没有指定它的返回值，它就会返回`Unit`，与Java中的`void`类似，但是`Unit`是一个真正的对象。你当然也可以指定任何其它的返回类型：

```kotlin
fun add(x: Int, y: Int) : Int {
    return x + y
}
```

>小提示：分号不是必须的
>>就想你在上面的例子中看到的那样，我在每句的最后没有使用分号。当然你也可以使用分号，分号不是必须的，而且不使用分号是一个不错的实践。当你这么做了，你会发现这节约了你很多时间。

然而如果返回的结果可以使用一个表达式计算出来，你可以不使用括号而是使用等号：

```kotlin
fun add(x: Int,y: Int) : Int = x + y
```
# 函数

函数（我们Java中的方法）可以使用`fun`关键字就可以定义:

```kotlin
fun onCreate(savedInstanceState: Bundle?) {
}
```

如果你没有指定它的返回值，它就会返回`Unit`，与Java中的`void`类似，但是`Unit`是一个真正的对象。你当然也可以指定任何其它的返回类型：

```kotlin
fun add(x: Int, y: Int) : Int {
    return x + y
}
```

>小提示：分号不是必须的
>>就想你在上面的例子中看到的那样，我在每句的最后没有使用分号。当然你也可以使用分号，分号不是必须的，而且不使用分号是一个不错的实践。当你这么做了，你会发现这节约了你很多时间。

然而如果返回的结果可以使用一个表达式计算出来，你可以不使用括号而是使用等号：

```kotlin
fun add(x: Int,y: Int) : Int = x + y
```
# 构造方法和函数参数

Kotlin中的参数与Java中有些不同。如你所见，我们先写参数的名字再写它的类型：

```kotlin
fun add(x: Int, y: Int) : Int {
    return x + y
}
```

我们可以给参数指定一个默认值使得它们变得可选，这是非常有帮助的。这里有一个例子，在Activity中创建了一个函数用来toast一段信息：

```kotlin
fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, length).show()
}
```

如你所见，第二个参数（length）指定了一个默认值。这意味着你调用的时候可以传入第二个值或者不传，这样可以避免你需要的重载函数：

```kotlin
toast("Hello")
toast("Hello", Toast.LENGTH_LONG)
```

这个与下面的Java代码是一样的：

```java
void toast(String message){
}

void toast(String message, int length){
    Toast.makeText(this, message, length).show();
}
```

这跟你想象的一样复杂。再看看这个例子：

```kotlin
fun niceToast(message: String,
                tag: String = javaClass<MainActivity>().getSimpleName(),
                length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, "[$className] $message", length).show()
}
```

我增加了第三个默认值是类名的tag参数。如果在Java中总数开销会以几何增长。现在可以通过以下方式调用：

```kotlin
toast("Hello")
toast("Hello", "MyTag")
toast("Hello", "MyTag", Toast.LENGTH_SHORT)
```

而且甚至还有其它选择，因为你可以使用参数名字来调用，这表示你可以通过在值前写明参数名来传入你希望的参数：

```kotlin
toast(message = "Hello", length = Toast.LENGTH_SHORT)
```

>小提示：String模版
>> 你可以在String中直接使用模版表达式。它可以帮助你很简单地在静态值和变量的基础上编写复杂的String。在上面的例子中，我使用了"[$className] $message"。

>> 如你所见，任何时候你使用一个`$`符号就可以插入一个表达式。如果这个表达式有一点复杂，你就需要使用一对大括号括起来："Your name is ${user.name}"。









