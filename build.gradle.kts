// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false
    // 이 코드로 변경해주세요 (본인의 코틀린 버전에 맞게 수정될 수 있습니다)
}