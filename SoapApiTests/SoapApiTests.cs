namespace SoapApiTests;

public class SoapApiTests
{
    private const string Email = "Rickyhousemen@gmail.com";
    private const string Password = "RickYo21";

    [Fact]
    public async Task HappyFlowTestAsync()
    {
        var client = new NopServiceClient();

        var result = await client.GetPaymentMethodCollectionAsync(Email, Password);

        result.Should().NotBeNull();
    }

    [Fact]
    public async Task IncorrectUsernameTestAsync()
    {
        var client = new NopServiceClient();

        var act = () => client.GetPaymentMethodCollectionAsync("nietRickyhousemen@gmail.com", Password);

        var exception = await Assert.ThrowsAsync<FaultException<ExceptionDetail>>(act);

        exception.Detail.Message.Should().Be("Not allowed");
    }

    [Fact]
    public async Task IncorrectPasswordTestAsync()
    {
        var client = new NopServiceClient();

        var act = () => client.GetPaymentMethodCollectionAsync(Email, "nietRicksPassword");

        var exception = await Assert.ThrowsAsync<FaultException<ExceptionDetail>>(act);

        exception.Detail.Message.Should().Be("Not allowed");
    }

    [Fact]
    public async Task SoapErrorTestAsync()
    {
        var client = new NopServiceClient();

        // todo: abort the call so it throws an exception when you use the SOAP.
        client.Abort();

        var act = () => client.GetPaymentMethodCollectionAsync(Email, "nietRicksPassword");

        await Assert.ThrowsAsync<CommunicationObjectAbortedException>(act);
    }
}