package com.ing.baker.runtime.java_api;

import com.ing.baker.runtime.core.events.*;

public interface TestBakerEventListener {

    @Subscribe
    void receiveBakerEvent(BakerEvent event);

    @Subscribe
    void createProcess(ProcessCreated event);

    @Subscribe
    void receiveEvent(EventReceived event);

    @Subscribe
    void rejectEvent(EventRejected eventRejected);

    @Subscribe
    void completeInteraction(InteractionCompleted interactionCompleted);

    @Subscribe
    void failInteraction(InteractionFailed interactionFailed);

    @Subscribe
    void startInteraction(InteractionStarted interactionStarted);
}
