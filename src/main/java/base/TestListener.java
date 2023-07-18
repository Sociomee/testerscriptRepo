package base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.net.MalformedURLException;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        String Platform = iTestResult.getMethod().getXmlTest().getLocalParameters().get("platform").toString();

        if (Platform.contains("android")) {
            try {
                AppFactory.Android_Login();
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        tearDown();

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        tearDown();
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        tearDown();

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    public void tearDown()
    {
        AppFactory.closeApp();

    }
}
