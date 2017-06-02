package e.mobile.com.twittertimelinesample

import android.app.ListActivity
import android.os.Bundle
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter
import com.twitter.sdk.android.tweetui.UserTimeline


class TimeLineActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_time_line)


        val userTimeline = UserTimeline.Builder().screenName("twitterdev").build()
        val adapter = TweetTimelineListAdapter.Builder(this)
                .setTimeline(userTimeline)
                .build()
        setListAdapter(adapter)


    }

}
