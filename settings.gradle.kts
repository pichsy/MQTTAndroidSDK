pluginManagement {
    repositories {
        maven(url = "https://jitpack.io")
        maven(url = "https://maven.aliyun.com/repository/public")
        maven(url = "https://maven.aliyun.com/repository/google")
        maven {
            credentials {
                username = "62fa2685aaa5896cee9e1174"
                password = "TYvWvmJu7]]T"
            }
            setUrl("https://packages.aliyun.com/maven/repository/2047378-release-EBo6g1/")
        }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven(url = "https://jitpack.io")
        maven(url = "https://maven.aliyun.com/repository/public")
        maven(url = "https://maven.aliyun.com/repository/google")
        maven {
            credentials {
                username = "62fa2685aaa5896cee9e1174"
                password = "TYvWvmJu7]]T"
            }
            setUrl("https://packages.aliyun.com/maven/repository/2047378-release-EBo6g1/")
        }
        google()
        mavenCentral()
    }
}

rootProject.name = "MQTTAndroidSDK"
include(":app")
include(":mqtt")
