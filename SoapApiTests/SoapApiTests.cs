using SoapApiTests.NopService;

namespace SoapApiTests;

using System;
using System.ServiceModel;
using Xunit;

public class SoapApiTests
{
    private const string ServiceUrl = "http://demowebshop.tricentis.com/Plugins/Misc.WebServicesCustomer/Remote/NopService.svc";
    
    private NopServiceClient CreateClient()
    {
        var binding = new BasicHttpBinding();
        var endpoint = new EndpointAddress(ServiceUrl);
        return new NopServiceClient(binding, endpoint);
    }

    [Fact]
    public void HappyFlowTest()
    {
        // TODO: Implement the test
    }

    [Fact]
    public void IncorrectUsernameTest()
    {
        // TODO: Implement the test
    }

    [Fact]
    public void IncorrectPasswordTest()
    {
        // TODO: Implement the test
    }

    [Fact]
    public void SoapErrorTest()
    {
        // TODO: Implement the test
    }
}
