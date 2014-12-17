AJS.$((function($){
    return function() {
        $('div.precure-heading').find('h1,h2,h3,h4,h5,h6').each(function(i, h){
            $(h).html('<span>'+$(h).html()+'</span>');
        });
    };
})(AJS.$));
