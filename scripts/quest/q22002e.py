# 22002 |   Sandwich for Breakfast (Evan intro)
sm.setSpeakerID(1013100)
sm.sendNext("Did you eat your breakfast, Evan? Then, will you do me a favor?\r\n\r\n#fUI/UIWindow2.img/QuestIcon/4/0# \r\n#i1003028# 1 #t1003028#  \r\n#i2022621# 5 #t2022621#s \r\n#i2022622# 5 #t2022622# \r\n\r\n#fUI/UIWindow2.img/QuestIcon/8/0# 60 exp")
sm.giveExp(60)
sm.giveItem(1003028)
sm.giveItem(2022621, 5)
sm.giveItem(2022622, 5)
sm.completeQuest(parentID)

sm.sendSayImage("UI/tutorial/evan/4/0")