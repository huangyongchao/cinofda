package com.adfonic.adserver;

//AF-335 - stats framework
public enum AdSrvCounter {
    /*
        AD_REQUEST, IP_INVALID, TARGETING_CONTEXT_EXCEPTION, AD_SPACE_DORMANT, AD_SPACE_INVALID, // 
        USER_AGENT_MISSING, USER_AGENT_UNWELCOME, PUBLICATION_PENDING, TEST_AD_ERROR, // 
        , FORMAT_UNSUPPORTED, AD_TARGET_START, AD_GENERATION_FAILED, POST_PROCESSING, //
        PARALLEL_AD, UNFILLED_REQUEST, AD_SERVED, AD_SPACE_VERIFIED, BID_EXCEPTION, //
    */
    NON_RTB_CACHE, FORMAT_INVALID, TRACKING_ID_INVALID, RENDER_ERROR,
    // Rtb->Byyd Mappers 
    MISS_IP, MISS_UA, MISS_SELL_ID, MISS_PUBL_ID, MISS_FIELD, BAD_FIELD, //
    // Pre RtbBidLogic
    NOBID_MODE, PUBLICATION_THROTTLING, GLOBAL_THROTTLING, UNKNOWN_PUBLISHER, UNKNOWN_PUBLICATION;
}
