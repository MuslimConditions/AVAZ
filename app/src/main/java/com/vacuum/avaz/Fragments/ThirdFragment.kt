package com.vacuum.avaz.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vacuum.avaz.Adapters.ArticleAdapter
import com.vacuum.avaz.Model.Article
import com.vacuum.avaz.R


/**
 * A simple [Fragment] subclass.
 */
class ThirdFragment : Fragment() {


    val articles: ArrayList<Article> = ArrayList()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_third,
                container, false)
        val rv_article_list_Fragment3: RecyclerView? = view?.findViewById(R.id.rv_article_list_Fragment3)

        // Inflate the layout for this fragment
        addarticles()
        // You can use GridLayoutManager if you want multiple columns. Enter the number of columns as a parameter.
        rv_article_list_Fragment3?.layoutManager = LinearLayoutManager(context)
        // Access the RecyclerView Adapter and load the data into it
        rv_article_list_Fragment3?.adapter = ArticleAdapter(articles, activity)

        return view
    }

    fun addarticles() {
        articles.add(Article("To Russia, with luck? The astronomical odds that separate England's young footballers from stardom", "The new recruits look a little green. Football Association Christopher Platts, Sheffield Hallam University Even for the most optimistic of supporters, England’s 2018 World Cup exploits lasted longer than many expected. However, if the past two weeks have felt long for you, then spare a thought for the players, whose arduous journey to Russia started many years ago in various academies across the country.", "https://images.theconversation.com/files/220016/original/file-20180522-51098-1j3q5b4.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("England fans sing 'football's coming home' – but where is 'home' really?", "The last time football “came home” coincided with Beatlemania, the Vietnam War, and the start of Mao’s Cultural Revolution. National Media Museum John Williams, University of Leicester “I don’t know whether you’ve heard it – it’s just a rumour”. This was an England supporter in Moscow recently talking on BBC Radio 5 Live, alongside an unsuspecting fan of a rival World Cup team. “Rumour?” he is asked, with genuine interest. “Yeah, it’s coming home. Football, and this World Cup. They’re coming home”. Cue howls of supportive laughter from his fellow England fans and bafflement from the rival supporter, who promptly wandered off for coffee in a nearby bar.", "https://images.theconversation.com/files/226399/original/file-20180705-122250-dwdw8q.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("As Putin-Trump summit nears, 3 charts explain how Russians see the US", "Erik C. Nisbet, The Ohio State University and Olga Kamenchuk, The Ohio State University Donald Trump sits down with Russian President Vladimir Putin on July 16 in Helsinki for their first one-on-one summit. In anticipation of this event, Russian his week about how they viewed the American president and", "https://images.pexels.com/photos/261949/pexels-photo-261949.jpeg?auto=compress&cs=tinysrgb&h=650&w=940"))
        articles.add(Article("Even self-driving cars need driver education", "Just like teenagers, robot drivers need lots of practice. Johanna Zmud, Texas A&M University What do self-driving cars and teenage drivers have in common? Experience. Or, more accurately, a lack of experience.", "https://images.theconversation.com/files/225522/original/file-20180629-117367-1uscrkc.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("Why the Supreme Court's 'gay wedding cake' ruling won't resolve religious freedom issues", "Pastors kneel in prayer in front of the Supreme Court, as a counter-protester holds a sign that says “What’s Christian About Discrimination.” AP Photo/Jacquelyn Martin David Mislin, Temple University The U.S. Supreme Court has issued its long-anticipated ruling in Masterpiece Cakeshop, Ltd. v. Colorado Civil Rights Commission. In a 7-2 decision, the justices sided with a Denver bakery owner who refused to make a wedding cake for a gay couple.", "https://images.pexels.com/photos/261949/pexels-photo-261949.jpeg?auto=compress&cs=tinysrgb&h=650&w=940"))
        articles.add(Article("How Christian media is shaping American politics", "President Donald Trump with televangelist Rev. Pat Robertson. AP Photo/Steve Helber Jason C. Bivins, North Carolina State University For Americans growing up between the 1950s and the 1980s, religion was not a regular presence on television. Aside from Sunday morning shows or occasional commercials, religious programming issued end-time warnings, sought monetary contributions, or staged faith healings. But it did not cover news.", "https://images.theconversation.com/files/220026/original/file-20180522-51105-p4w2a9.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("To Russia, with luck? The astronomical odds that separate England's young footballers from stardom", "The new recruits look a little green. Football Association Christopher Platts, Sheffield Hallam University Even for the most optimistic of supporters, England’s 2018 World Cup exploits lasted longer than many expected. However, if the past two weeks have felt long for you, then spare a thought for the players, whose arduous journey to Russia started many years ago in various academies across the country.", "https://images.theconversation.com/files/227195/original/file-20180711-27036-1ngw6g5.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("England fans sing 'football's coming home' – but where is 'home' really?", "The last time football “came home” coincided with Beatlemania, the Vietnam War, and the start of Mao’s Cultural Revolution. National Media Museum John Williams, University of Leicester “I don’t know whether you’ve heard it – it’s just a rumour”. This was an England supporter in Moscow recently talking on BBC Radio 5 Live, alongside an unsuspecting fan of a rival World Cup team. “Rumour?” he is asked, with genuine interest. “Yeah, it’s coming home. Football, and this World Cup. They’re coming home”. Cue howls of supportive laughter from his fellow England fans and bafflement from the rival supporter, who promptly wandered off for coffee in a nearby bar.", "https://images.theconversation.com/files/226399/original/file-20180705-122250-dwdw8q.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("As Putin-Trump summit nears, 3 charts explain how Russians see the US", "Erik C. Nisbet, The Ohio State University and Olga Kamenchuk, The Ohio State University Donald Trump sits down with Russian President Vladimir Putin on July 16 in Helsinki for their first one-on-one summit. In anticipation of this event, Russian his week about how they viewed the American president and", "https://images.pexels.com/photos/261949/pexels-photo-261949.jpeg?auto=compress&cs=tinysrgb&h=650&w=940"))
        articles.add(Article("Even self-driving cars need driver education", "Just like teenagers, robot drivers need lots of practice. Johanna Zmud, Texas A&M University What do self-driving cars and teenage drivers have in common? Experience. Or, more accurately, a lack of experience.", "https://images.theconversation.com/files/225522/original/file-20180629-117367-1uscrkc.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("Why the Supreme Court's 'gay wedding cake' ruling won't resolve religious freedom issues", "Pastors kneel in prayer in front of the Supreme Court, as a counter-protester holds a sign that says “What’s Christian About Discrimination.” AP Photo/Jacquelyn Martin David Mislin, Temple University The U.S. Supreme Court has issued its long-anticipated ruling in Masterpiece Cakeshop, Ltd. v. Colorado Civil Rights Commission. In a 7-2 decision, the justices sided with a Denver bakery owner who refused to make a wedding cake for a gay couple.", "https://images.pexels.com/photos/261949/pexels-photo-261949.jpeg?auto=compress&cs=tinysrgb&h=650&w=940"))
        articles.add(Article("How Christian media is shaping American politics", "President Donald Trump with televangelist Rev. Pat Robertson. AP Photo/Steve Helber Jason C. Bivins, North Carolina State University For Americans growing up between the 1950s and the 1980s, religion was not a regular presence on television. Aside from Sunday morning shows or occasional commercials, religious programming issued end-time warnings, sought monetary contributions, or staged faith healings. But it did not cover news.", "https://images.theconversation.com/files/220026/original/file-20180522-51105-p4w2a9.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("To Russia, with luck? The astronomical odds that separate England's young footballers from stardom", "The new recruits look a little green. Football Association Christopher Platts, Sheffield Hallam University Even for the most optimistic of supporters, England’s 2018 World Cup exploits lasted longer than many expected. However, if the past two weeks have felt long for you, then spare a thought for the players, whose arduous journey to Russia started many years ago in various academies across the country.", "https://images.theconversation.com/files/227195/original/file-20180711-27036-1ngw6g5.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("England fans sing 'football's coming home' – but where is 'home' really?", "The last time football “came home” coincided with Beatlemania, the Vietnam War, and the start of Mao’s Cultural Revolution. National Media Museum John Williams, University of Leicester “I don’t know whether you’ve heard it – it’s just a rumour”. This was an England supporter in Moscow recently talking on BBC Radio 5 Live, alongside an unsuspecting fan of a rival World Cup team. “Rumour?” he is asked, with genuine interest. “Yeah, it’s coming home. Football, and this World Cup. They’re coming home”. Cue howls of supportive laughter from his fellow England fans and bafflement from the rival supporter, who promptly wandered off for coffee in a nearby bar.", "https://images.theconversation.com/files/226399/original/file-20180705-122250-dwdw8q.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("As Putin-Trump summit nears, 3 charts explain how Russians see the US", "Erik C. Nisbet, The Ohio State University and Olga Kamenchuk, The Ohio State University Donald Trump sits down with Russian President Vladimir Putin on July 16 in Helsinki for their first one-on-one summit. In anticipation of this event, Russian his week about how they viewed the American president and", "https://images.pexels.com/photos/261949/pexels-photo-261949.jpeg?auto=compress&cs=tinysrgb&h=650&w=940"))
        articles.add(Article("Even self-driving cars need driver education", "Just like teenagers, robot drivers need lots of practice. Johanna Zmud, Texas A&M University What do self-driving cars and teenage drivers have in common? Experience. Or, more accurately, a lack of experience.", "https://images.theconversation.com/files/225522/original/file-20180629-117367-1uscrkc.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("Why the Supreme Court's 'gay wedding cake' ruling won't resolve religious freedom issues", "Pastors kneel in prayer in front of the Supreme Court, as a counter-protester holds a sign that says “What’s Christian About Discrimination.” AP Photo/Jacquelyn Martin David Mislin, Temple University The U.S. Supreme Court has issued its long-anticipated ruling in Masterpiece Cakeshop, Ltd. v. Colorado Civil Rights Commission. In a 7-2 decision, the justices sided with a Denver bakery owner who refused to make a wedding cake for a gay couple.", "https://images.pexels.com/photos/261949/pexels-photo-261949.jpeg?auto=compress&cs=tinysrgb&h=650&w=940"))
        articles.add(Article("How Christian media is shaping American politics", "President Donald Trump with televangelist Rev. Pat Robertson. AP Photo/Steve Helber Jason C. Bivins, North Carolina State University For Americans growing up between the 1950s and the 1980s, religion was not a regular presence on television. Aside from Sunday morning shows or occasional commercials, religious programming issued end-time warnings, sought monetary contributions, or staged faith healings. But it did not cover news.", "https://images.theconversation.com/files/220026/original/file-20180522-51105-p4w2a9.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("To Russia, with luck? The astronomical odds that separate England's young footballers from stardom", "The new recruits look a little green. Football Association Christopher Platts, Sheffield Hallam University Even for the most optimistic of supporters, England’s 2018 World Cup exploits lasted longer than many expected. However, if the past two weeks have felt long for you, then spare a thought for the players, whose arduous journey to Russia started many years ago in various academies across the country.", "https://images.theconversation.com/files/227195/original/file-20180711-27036-1ngw6g5.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("England fans sing 'football's coming home' – but where is 'home' really?", "The last time football “came home” coincided with Beatlemania, the Vietnam War, and the start of Mao’s Cultural Revolution. National Media Museum John Williams, University of Leicester “I don’t know whether you’ve heard it – it’s just a rumour”. This was an England supporter in Moscow recently talking on BBC Radio 5 Live, alongside an unsuspecting fan of a rival World Cup team. “Rumour?” he is asked, with genuine interest. “Yeah, it’s coming home. Football, and this World Cup. They’re coming home”. Cue howls of supportive laughter from his fellow England fans and bafflement from the rival supporter, who promptly wandered off for coffee in a nearby bar.", "https://images.theconversation.com/files/226399/original/file-20180705-122250-dwdw8q.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("As Putin-Trump summit nears, 3 charts explain how Russians see the US", "Erik C. Nisbet, The Ohio State University and Olga Kamenchuk, The Ohio State University Donald Trump sits down with Russian President Vladimir Putin on July 16 in Helsinki for their first one-on-one summit. In anticipation of this event, Russian his week about how they viewed the American president and", "https://images.pexels.com/photos/261949/pexels-photo-261949.jpeg?auto=compress&cs=tinysrgb&h=650&w=940"))
        articles.add(Article("Even self-driving cars need driver education", "Just like teenagers, robot drivers need lots of practice. Johanna Zmud, Texas A&M University What do self-driving cars and teenage drivers have in common? Experience. Or, more accurately, a lack of experience.", "https://images.theconversation.com/files/225522/original/file-20180629-117367-1uscrkc.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))
        articles.add(Article("Why the Supreme Court's 'gay wedding cake' ruling won't resolve religious freedom issues", "Pastors kneel in prayer in front of the Supreme Court, as a counter-protester holds a sign that says “What’s Christian About Discrimination.” AP Photo/Jacquelyn Martin David Mislin, Temple University The U.S. Supreme Court has issued its long-anticipated ruling in Masterpiece Cakeshop, Ltd. v. Colorado Civil Rights Commission. In a 7-2 decision, the justices sided with a Denver bakery owner who refused to make a wedding cake for a gay couple.", "https://images.pexels.com/photos/261949/pexels-photo-261949.jpeg?auto=compress&cs=tinysrgb&h=650&w=940"))
        articles.add(Article("How Christian media is shaping American politics", "President Donald Trump with televangelist Rev. Pat Robertson. AP Photo/Steve Helber Jason C. Bivins, North Carolina State University For Americans growing up between the 1950s and the 1980s, religion was not a regular presence on television. Aside from Sunday morning shows or occasional commercials, religious programming issued end-time warnings, sought monetary contributions, or staged faith healings. But it did not cover news.", "https://images.theconversation.com/files/220026/original/file-20180522-51105-p4w2a9.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=754&fit=clip"))

    }
}