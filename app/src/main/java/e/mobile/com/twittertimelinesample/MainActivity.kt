package e.mobile.com.twittertimelinesample

import android.app.ListActivity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.twitter.sdk.android.core.Twitter
import com.twitter.sdk.android.core.TwitterAuthConfig
import com.twitter.sdk.android.core.DefaultLogger
import com.twitter.sdk.android.core.TwitterConfig
import com.twitter.sdk.android.tweetui.UserTimeline
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val config = TwitterConfig.Builder(this)
                .logger(DefaultLogger(Log.DEBUG))
                .twitterAuthConfig(TwitterAuthConfig(getString(R.string.consumer_key), getString(R.string.consumer_secret)))
                .debug(true)
                .build()
        Twitter.initialize(config)


        var twitterLoginBtn= findViewById(R.id.twitterLoginBtn) as Button
        twitterLoginBtn.setOnClickListener(View.OnClickListener {

            startActivity(Intent(this, TimeLineActivity :: class.java))
        })
    }
}
