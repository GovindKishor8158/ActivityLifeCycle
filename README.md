# ActivityLifeCycle
ActivityLifeCycle situation ko samjhna hai.
(Try to understand the diffrent scenerio of actvity life cycle from launching to destroy.)
=> jab app lunch hota hai(when app launched)=>  oncreate->onstart->onresume
=> jb app background state me home button press hota hai(when app go background state on home button click)=> onpause->onstop
=> jb app background se foreground state me jata hai(Again comes to the foreground state)=> onrestart->onstart->onresume
=> jb app destroy ho jata hai(when app closed)=> onpause->onstop->ondestroy
=>jb  activity ek se activity 2 per jate hai to(when going one activity to another activity)=> onPause->oncreate->onstart->onresume->onstop
