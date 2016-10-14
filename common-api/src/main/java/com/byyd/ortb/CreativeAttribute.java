package com.byyd.ortb;

public enum CreativeAttribute {
    _,
    AUDIO_AD_AUTO_PLAY,
    AUDIO_AD_USER_INITIATED,
    EXPANDABLE_AUTOMATIC,
    EXPANDABLE_USER_INITIATED_CLICK,
    EXPANDABLE_USER_INITIATED_ROLLOVER,
    IN_BANNER_VIDEO_AD_AUTO_PLAY,
    IN_BANNER_VIDEO_AD_USER_INITIATED,
    POP_OVER_UNDER_OR_UPON_EXIT,
    PROVOCATIVE_OR_SUGGESTIVE_IMAGERY,
    SHAKY_FLASHING_FLICKERING_EXTREME_ANIMATION_SMILEYS,
    SURVEYS,
    TEXT_ONLY,
    USER_INTERACTIVE,
    WINDOWS_DIALOG_OR_ALERT,
    /*TODO Following are Open RTB v2 only. Bifurcate when we start using any of them*/
    HAS_AUDIO_ON_OFF_BUTTON,
    AD_CAN_BE_SKIPPED
}