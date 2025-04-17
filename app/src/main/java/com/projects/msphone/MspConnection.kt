package com.projects.msphone

import android.telecom.CallAudioState
import android.telecom.Connection

class MspConnection : Connection() {

    override fun onShowIncomingCallUi() {
        super.onShowIncomingCallUi()
        // show incoming call UI
    }

    override fun onCallAudioStateChanged(state: CallAudioState?) {
        super.onCallAudioStateChanged(state)
        /*
        This is called in response to your app changing the audio
        mode using the setAudioRoute(int) method. This method may
        also be called if the system changes the audio route (for
        example, when a Bluetooth headset disconnects)
         */
    }

    override fun onHold() {
        super.onHold()
        /*
        In response to this request, your app should hold the call
        and then invoke the setOnHold() method to inform the system
        that the call is being held
         */
    }

    override fun onUnhold() {
        super.onUnhold()
        /*
        Once your app has resumed the call, it should invoke the setActive()
        method to inform the system that the call is no longer on hold
         */
    }

    override fun onAnswer() {
        super.onAnswer()
        /*
        The telecom subsystem calls this method to inform your app that an
        incoming call should be answered. Once your app has answered the call,
        it should invoke the setActive() method to inform the system that the
        call has been answered.
         */
    }

    override fun onReject() {
        super.onReject()
        /*
        The telecom subsystem calls this method when it wants to reject an
        incoming call. Once your app has rejected the call, it should call
        the setDisconnected(DisconnectCause) and specify REJECTED as the
        parameter. Your app should then call the destroy() method to inform
        the system that the app has processed the call.
         */
    }

    override fun onDisconnect() {
        super.onDisconnect()
        /*
        The telecom subsystem calls this method when it wants to disconnect
        a call. Once the call has ended, your app should call the
        setDisconnected(DisconnectCause) method and specify LOCAL as the
        parameter to indicate that a user request caused the call to be
        disconnected. Your app should then call the destroy() method to
        inform the telecom subsystem that the app has processed the call.
         */
    }
}