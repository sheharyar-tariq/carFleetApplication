$('document').ready(function(){
    $('.table #editVehicleType').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href')
        $.get(href,function (vehicleType,status){
            $('#vehicleTypeId').val(vehicleType.vehicleTypeId);
            $('#editDetails').val(vehicleType.details);
            $('#editDescription').val(vehicleType.description);

        })

        $('#editModal').modal();
    });

    $('.table #deleteVehicleType').on('click',function (event){
        event.preventDefault();
        const href = $(this).attr('href')
        $('#confirmedDelete').attr('href',href);
        $('#deleteModal').modal();
    });
});