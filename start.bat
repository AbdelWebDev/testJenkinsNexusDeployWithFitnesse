setLocal EnableDelayedExpansion
set CLASSPATH="
for /R target\dependencies %%a in (*.jar) do (
   set CLASSPATH=!CLASSPATH!;%%a
)
set CLASSPATH=!CLASSPATH!"
echo !CLASSPATH!

java -cp !CLASSPATH! fitnesseMain.FitNesseMain -p 9090 -d C:\ -e 0 
