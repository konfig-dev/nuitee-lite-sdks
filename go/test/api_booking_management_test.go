/*
Lite API

Testing BookingManagementApiService

*/

// Code generated by Konfig (https://konfigthis.com);

package nuitee

import (
    "github.com/stretchr/testify/assert"
    "github.com/stretchr/testify/require"
    "testing"
    nuitee "github.com/konfig-dev/nuitee-lite-sdks/go"
)

func Test_nuitee_BookingManagementApiService(t *testing.T) {

    configuration := nuitee.NewConfiguration()
    apiClient := nuitee.NewAPIClient(configuration)

    t.Run("Test BookingManagementApiService Cancel", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var bookingId string

        resp, httpRes, err := apiClient.BookingManagementApi.Cancel(bookingId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test BookingManagementApiService ListBookings", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        resp, httpRes, err := apiClient.BookingManagementApi.ListBookings().Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

    t.Run("Test BookingManagementApiService Retrieve", func(t *testing.T) {

        t.Skip("skip test")  // remove to run test

        var bookingId string

        resp, httpRes, err := apiClient.BookingManagementApi.Retrieve(bookingId).Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)

    })

}
