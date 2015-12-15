package com.scottruth.timeoffandroid.controller;

import com.scottruth.timeoffandroid.helper.GeneralErrorHelper;

import javax.inject.Inject;

/**
 * Created by santiago on 12/10/15.
 * To distinguish between controller that use the services, and those which don't.
 */
public abstract class ServiceController extends Controller {
    @Inject
    GeneralErrorHelper generalErrorHelper;
}